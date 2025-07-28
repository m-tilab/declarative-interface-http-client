package com.example.declarativeinterfacehttpclient.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users/httpclient")
public class UserHttpClientController {

    private final UserHttpClient userHttpClient;

    public UserHttpClientController(UserHttpClient userHttpClient) {
        this.userHttpClient = userHttpClient;
    }

    @GetMapping("")
    public List<User> getUsers() {
        return userHttpClient.getUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userHttpClient.getUserById(id);
    }
}
