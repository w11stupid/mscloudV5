package com.atguigu.cloud;

import com.sun.tools.javac.Main;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/05/16/22:15
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul为注册中心时注册服务
public class Main80 {
    public static void main(String[] args) {
        SpringApplication.run(Main80.class,args);
    }
}