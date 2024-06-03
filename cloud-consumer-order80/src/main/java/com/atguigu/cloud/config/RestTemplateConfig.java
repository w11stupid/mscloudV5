package com.atguigu.cloud.config;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/05/16/22:21
 * @Description:
 * @LoadBalanced是Spring Cloud中用于负载均衡的注解，通常与RestTemplate或WebClient一起使用。
 * 当在RestTemplate或WebClient上添加@LoadBalanced注解时，Spring Cloud会自动为这些客户端添加负载均衡的能力。
 * 具体来说，@LoadBalanced注解会触发一个拦截器，该拦截器会在发送请求之前，
 * 根据服务名来选择具体的服务实例。这样就实现了在微服务架构中对服务实例进行负载均衡，从而提高系统的可用性和性能。
 * 总的来说，@LoadBalanced注解的作用是为RestTemplate或WebClient添加负载均衡的能力，
 * 使得在微服务架构中能够更加灵活地调用其他服务，并实现负载均衡的效果。
 */

@Configuration
@LoadBalancerClient(
        //下面的value值大小写一定要和consul里面的名字一样，必须一样
        value = "cloud-payment-service",configuration = RestTemplateConfig.class)
public class RestTemplateConfig
{
    @Bean
    @LoadBalanced //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    ReactorLoadBalancer<ServiceInstance> randomLoadBalancer(Environment environment,
                                                            LoadBalancerClientFactory loadBalancerClientFactory)
    {
        String name = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
        return new RandomLoadBalancer(loadBalancerClientFactory
                .getLazyProvider(name, ServiceInstanceListSupplier.class), name);
    }
}
