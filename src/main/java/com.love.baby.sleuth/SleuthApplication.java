package com.love.baby.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author liangbc
 * @date 2017/7/25
 */
@EnableDiscoveryClient
@EnableZipkinServer
@ComponentScan(basePackages = {"zipkin.*"})
@SpringCloudApplication
public class SleuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthApplication.class, args);
    }
}