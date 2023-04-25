package tech.carvia.emailservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.carvia.emailservice.model.User;
import tech.carvia.emailservice.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
