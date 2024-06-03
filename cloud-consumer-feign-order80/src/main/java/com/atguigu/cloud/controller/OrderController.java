package com.atguigu.cloud.controller;


import cn.hutool.core.date.DateUtil;
import com.atguigu.cloud.apis.PayFeignApi;
import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.resp.ReturnCodeEnum;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/05/16/22:37
 * @Description:
 */
@RestController
public class OrderController {
    @Resource
    private PayFeignApi payFeignApi;

    @PostMapping("/feign/pay/add")
    public ResultData addOrder(@RequestBody PayDTO payDTO){
        System.out.println("第一步：模拟本地addOrder新增订单成功(省略sql操作)，第二步：再开启addPay支付微服务远程调用");
        ResultData resultData = payFeignApi.addPay(payDTO);
        return resultData;
    }

    @GetMapping("/feign/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id){
        System.out.println("-------支付微服务远程调用，按照id查询订单支付流水信息");

        ResultData resultData = null;
        try {
            System.out.println("---调用开始："+ DateUtil.now());
            resultData = payFeignApi.getPayInfo(id);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("---调用结束："+ DateUtil.now());
            return ResultData.fail(ReturnCodeEnum.RC500.getCode(),e.getMessage());
        }

        return resultData;
    }

    /**
     * openfeign 天然支持负载均衡
     * @return
     */
    @GetMapping("/feign/pay/mylb")
    public String mylb(){
        System.out.println("实现负载均衡操作");
        return payFeignApi.mylb();
    }
}
