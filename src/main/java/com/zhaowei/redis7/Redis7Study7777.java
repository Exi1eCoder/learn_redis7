package com.zhaowei.redis7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.zhaowei.redis7.mapper") //import tk.mybatis.spring.annotation.MapperScan;
public class Redis7Study7777 {
    public static void main(String[] args) {
        SpringApplication.run(Redis7Study7777.class, args);
    }
}
