package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/05/16/14:47
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.atguigu.cloud.mapper")
@EnableDiscoveryClient
@RefreshScope
public class Main8001 {
    public static void main(String[] args) {
        SpringApplication.run(Main8001.class,args);
    }
}