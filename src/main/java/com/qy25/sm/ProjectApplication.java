package com.qy25.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:17
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.qy25.sm.mapper")
public class ProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class);
    }
}
