package com.xiaojie.lcn.api.member.impl;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @author: xiaojie
 * @date: 2021.07.19
 */
@SpringBootApplication
@EnableDistributedTransaction
@EnableFeignClients
@MapperScan("com.xiaojie.lcn.api.member.impl.mapper")
public class MemberApp {
    public static void main(String[] args) {
        SpringApplication.run(MemberApp.class);
    }
}