package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/05/31/15:04
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class Main83 {
    public static void main(String[] args) {
        SpringApplication.run(Main83.class, args);
    }
}
