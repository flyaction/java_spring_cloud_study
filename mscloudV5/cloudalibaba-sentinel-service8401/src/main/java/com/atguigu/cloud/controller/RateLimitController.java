package com.atguigu.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: action
 * @create: 2024/11/28 15:22
 **/
@RestController
@Slf4j
public class RateLimitController
{
    @GetMapping("/rateLimit/byUrl")
    public String byUrl()
    {
        return "按rest地址限流测试OK";
    }
}
