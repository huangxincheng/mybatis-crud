package com.limaila;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
@SpringBootApplication
@MapperScan("com.limaila.**.mapper")
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }
}
