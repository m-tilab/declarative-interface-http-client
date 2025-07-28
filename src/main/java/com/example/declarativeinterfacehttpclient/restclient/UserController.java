package com.example.declarativeinterfacehttpclient.restclient;

import com.example.declarativeinterfacehttpclient.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRestClient userRestClient;

    public UserController(UserRestClient userRestClient) {
        this.userRestClient = userRestClient;
    }

    @GetMapping("")
    public List<User> getUsers() {
        return userRestClient.getUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userRestClient.getUserById(id);
    }
}
