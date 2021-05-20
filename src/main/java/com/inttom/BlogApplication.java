package com.inttom;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

    static Log log = LogFactory.get();

    public static void main(String[] args) {
        log.info("start");
        SpringApplication.run(BlogApplication.class, args);
    }

}
