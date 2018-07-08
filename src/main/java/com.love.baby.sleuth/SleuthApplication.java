package com.love.baby.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author liangbc
 * @date 2017/7/25
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@zipkin.server.internal.EnableZipkinServer
@SpringCloudApplication
public class SleuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthApplication.class, args);
    }
}