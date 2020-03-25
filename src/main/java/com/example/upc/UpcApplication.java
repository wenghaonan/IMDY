package com.example.upc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.upc"})
@MapperScan("com.example.upc.dao")
public class UpcApplication {
    public static void main(String[] args) {
        SpringApplication.run(UpcApplication.class, args);
    }
}
