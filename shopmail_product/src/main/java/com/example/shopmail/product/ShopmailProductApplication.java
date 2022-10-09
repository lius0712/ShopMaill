package com.example.shopmail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置数据库驱动
 * 配置数据源
 */
@MapperScan("com.example.shopmail.product.dao")
@SpringBootApplication
public class ShopmailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopmailProductApplication.class, args);
    }

}
