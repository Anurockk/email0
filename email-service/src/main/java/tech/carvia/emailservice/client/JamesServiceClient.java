package tech.carvia.emailservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import tech.carvia.emailservice.model.User;

import java.util.List;

@FeignClient(value = "ApacheJames", url = "http://localhost:8000/")
public interface JamesServiceClient {

    @GetMapping("/users")
    List<User> getAllUsers();
}
