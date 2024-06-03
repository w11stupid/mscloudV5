package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/06/02/10:29
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main9528 {
    public static void main(String[] args) {
        SpringApplication.run(Main9528.class,args);
    }
}