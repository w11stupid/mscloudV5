package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/05/31/15:17
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClient3377{
    public static void main(String[] args)
    {
        SpringApplication.run(NacosConfigClient3377.class,args);
    }
}