package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * @author: action
 * @create: 2024/12/3 14:59
 **/
public interface OrderService
{
    /**
     * 创建订单
     */
    void create(Order order);
}
