package com.example.declarativeinterfacehttpclient;

import com.example.declarativeinterfacehttpclient.httpclient.UserHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class DeclarativeInterfaceHttpClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeclarativeInterfaceHttpClientApplication.class, args);
    }

}
