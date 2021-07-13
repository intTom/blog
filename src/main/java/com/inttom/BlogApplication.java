package com.inttom;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class BlogApplication {
    static Log log = LogFactory.get();

    public static void main(String[] args) {
        log.info("hutool的log配置");
        SpringApplication.run(BlogApplication.class, args);
    }

}
