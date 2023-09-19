package com.cyt.businessaccount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.cyt.businessaccount.**")
@EnableFeignClients(basePackages = "com.cyt.businessaccount.feign")
public class BusinessAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessAccountApplication.class, args);
    }

}
