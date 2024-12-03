package com.atguigu.cloud.service;

/**
 * @author: action
 * @create: 2024/12/3 16:14
 **/
public interface StorageService
{
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
