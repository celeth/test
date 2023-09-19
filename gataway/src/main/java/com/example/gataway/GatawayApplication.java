package com.example.gataway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatawayApplication.class, args);
    }

}
