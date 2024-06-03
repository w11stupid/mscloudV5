package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/06/03/0:42
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.atguigu.cloud.mapper") //import tk.mybatis.spring.annotation.MapperScan;
@EnableDiscoveryClient //服务注册和发现
@EnableFeignClients
public class SeataStorageMainApp2002
{
    public static void main(String[] args)
    {
        SpringApplication.run(SeataStorageMainApp2002.class,args);
    }
}