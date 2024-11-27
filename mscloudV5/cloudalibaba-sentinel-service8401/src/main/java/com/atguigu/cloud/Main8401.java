package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: action
 * @create: 2024/11/27 10:52
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class Main8401 {
    public static void main(String[] args) {
        SpringApplication.run(Main8401.class,args);
    }
}