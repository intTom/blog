package com.inttom;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
/**
 *
 * 一个 *  代表一级包；比如可以扫到com.demo.aaa.mapper,不能扫到com.demo.aaa.bbb.mapper;
 * 两个 * 代表任意个包；比如可以扫到com.demo.aaa.mapper,也可以扫到com.demo.aaa.bbb.mapper
 */
public class BlogApplication {

    static Log log = LogFactory.get();

    public static void main(String[] args) {
        log.info("start");
        SpringApplication.run(BlogApplication.class, args);
    }

}
