package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author: action
 * @create: 2024/11/4 14:04
 **/
@RestController
public class OrderController
{
    //先写死，硬编码
    //public static final String PaymentSrv_URL = "http://localhost:8001";
    //服务注册中心上的微服务名称
    public static final String PaymentSrv_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/pay/add")
    public ResultData addOrder(PayDTO payDTO){

        return restTemplate.postForObject(PaymentSrv_URL+"/pay/add",payDTO,ResultData.class);
    }

    @DeleteMapping("/consumer/pay/del/{id}")
    public ResultData delOrder(@PathVariable("id") Integer id) {
        return restTemplate.exchange(PaymentSrv_URL + "/pay/del/" + id, HttpMethod.DELETE, null, ResultData.class).getBody();
    }

    @PutMapping("/consumer/pay/update")
    public ResultData delOrder(@RequestBody PayDTO payDTO) {
        return restTemplate.exchange(PaymentSrv_URL + "/pay/update/", HttpMethod.PUT, new HttpEntity<>(payDTO), ResultData.class).getBody();
    }

    @GetMapping("/consumer/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id){
        return restTemplate.getForObject(PaymentSrv_URL + "/pay/get/"+id, ResultData.class, id);
    }

    @GetMapping(value = "/consumer/pay/get/info")
    private String getInfoByConsul()
    {
        return restTemplate.getForObject(PaymentSrv_URL + "/pay/get/info", String.class);
    }


}
