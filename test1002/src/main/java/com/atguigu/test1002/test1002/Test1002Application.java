package com.atguigu.test1002.test1002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.test1002.test1002.mapper")
public class Test1002Application {

    public static void main(String[] args) {
        SpringApplication.run(Test1002Application.class, args);
    }

}
