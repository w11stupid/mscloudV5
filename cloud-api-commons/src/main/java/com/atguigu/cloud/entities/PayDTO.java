package com.atguigu.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许瑞淇
 * @Date: 2024/05/16/14:56
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayDTO implements Serializable {
    private Integer id;
    //支付流水号
    private String payNo;
    //订单流水号
    private String orderNo;
    //用户账号ID
    private Integer userId;
    //交易金额
    private BigDecimal amount;
}
