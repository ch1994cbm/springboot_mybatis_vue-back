package com.tjcu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 王恒杰
 * @date 2021/12/17 14:46
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.tjcu.dao")
public class EmpApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmpApplication.class,args);
    }
}
