package com.love.baby.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

/**
 * Created by liangbc on 2017/7/25.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient //注册到eureka
@EnableZipkinStreamServer
@SpringBootApplication(scanBasePackages = {"com.love"})
public class SleuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthApplication.class, args);
    }
}