package com.lee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication
@MapperScan("com.lee.mapper")
public class HelloApplication {

    public static void main(String[] args){
        SpringApplication.run(HelloApplication.class,args);
    }
}
