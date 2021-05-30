package com.inttom;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.inttom.*.mapper")
@EnableSwagger2
public class BlogApplication {

    static Log log = LogFactory.get();

    public static void main(String[] args) {
        log.info("start");
        SpringApplication.run(BlogApplication.class, args);
    }

}
