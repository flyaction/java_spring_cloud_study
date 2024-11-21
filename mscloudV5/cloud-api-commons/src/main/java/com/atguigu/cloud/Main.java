package com.atguigu.cloud;

import java.time.ZonedDateTime;

/**
 * @author: action
 * @create: 2024/11/4 17:37
 **/
public class Main {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();//默认时区
        System.out.println(zdt);
    }
}