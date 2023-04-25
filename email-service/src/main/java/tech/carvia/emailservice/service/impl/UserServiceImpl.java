package tech.carvia.emailservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.carvia.emailservice.client.JamesServiceClient;
import tech.carvia.emailservice.model.User;
import tech.carvia.emailservice.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final JamesServiceClient jamesServiceClient;
    @Override
    public List<User> getAllUsers() {
        return jamesServiceClient.getAllUsers();
    }
}
