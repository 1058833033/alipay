package com.alipay.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ChenJie
 * @date 2020-06-17 11:37:49
 * 功能说明
 */
@SpringBootApplication(scanBasePackages = "com.alipay")
public class AliPayApplication {
    //
    public static void main(String[] args) {
        SpringApplication.run(AliPayApplication.class,args);
    }
}
