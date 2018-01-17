package com.love.baby.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liangbc on 2017/7/25.
 */
@EnableDiscoveryClient
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"com.love"})
public class SleuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthApplication.class, args);
    }
}