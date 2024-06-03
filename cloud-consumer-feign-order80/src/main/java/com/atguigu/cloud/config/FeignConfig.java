package com.atguigu.cloud.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/05/21/22:42
 * @Description: Open Feign 配置类，开启默认机制，或者重试机制
 * 开启日志功能
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer myRetryer(){
        return Retryer.NEVER_RETRY;
        //return new Retryer.Default(100,1,3);
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
