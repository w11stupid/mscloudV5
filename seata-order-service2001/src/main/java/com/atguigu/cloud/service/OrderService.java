package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/06/03/0:24
 * @Description:
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
