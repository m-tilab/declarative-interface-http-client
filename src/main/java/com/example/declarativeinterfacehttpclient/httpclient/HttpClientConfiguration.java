package com.example.declarativeinterfacehttpclient.httpclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.client.support.RestClientHttpServiceGroupConfigurer;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(group = "users", basePackages = "com.example.declarativeinterfacehttpclient.httpclient")
public class HttpClientConfiguration {

    @Bean
    RestClient.Builder restClient() {
        return RestClient
                .builder();
    }

//    @Bean
//    UserHttpClient userHttpClient(RestClient.Builder builder) {
//        RestClient restClient = builder
//                .baseUrl("https://jsonplaceholder.typicode.com")
//                .build();
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory
//                .builderFor(RestClientAdapter.create(restClient))
//                .build();
//        return factory.createClient(UserHttpClient.class);
//
//    }
}
