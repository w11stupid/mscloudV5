package com.atguigu.cloud.apis;


import com.atguigu.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/06/02/0:35
 * @Description:
 */
@FeignClient(value = "nacos-payment-provider",fallback = PayFeignSentinelApiFallBack.class)
public interface PayFeignSentinelApi
{
    @GetMapping("/pay/nacos/get/{orderNo}")
    public ResultData getPayByOrderNo(@PathVariable("orderNo") String orderNo);
}
