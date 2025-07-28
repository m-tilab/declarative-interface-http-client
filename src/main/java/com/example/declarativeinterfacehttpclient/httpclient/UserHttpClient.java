package com.example.declarativeinterfacehttpclient.httpclient;

import com.example.declarativeinterfacehttpclient.user.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface UserHttpClient {

    @GetExchange("https://jsonplaceholder.typicode.com/users")
    List<User> getUsers();

    @GetExchange("https://jsonplaceholder.typicode.com/users/{id}")
    User getUserById(@PathVariable Integer id);
}
