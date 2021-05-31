package com.inttom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author inttom
 * @date 2021/5/30
 */
@Configuration  //说明这是一个配置类
@EnableSwagger2 // 该注解开启Swagger2的自动配置
@ComponentScan("com.inttom.*.controller")
public class SwaggerConfig {
    @Bean
    public Docket docker() {
        // 构造函数传入初始化规范，这是swagger2规范
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                //apiInfo： 添加api详情信息，参数为ApiInfo类型的参数，这个参数包含了第二部分的所有信息比如标题、描述、版本之类的，开发中一般都会自定义这些信息
                .apiInfo(apiInfo())
                .groupName("inttom")
                //配置是否启用Swagger，如果是false，在浏览器将无法访问，默认是true
                .enable(true)
                .select()
                //apis： 添加过滤条件,
                .apis(RequestHandlerSelectors.basePackage("com.inttom"))
//                paths： 这里是控制哪些路径的api会被显示出来，比如下方的参数就是除了/user以外的其它路径都会生成api文档
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("inttom", "https://github.com/intTom/blog", "邮箱：暂无");
        return new ApiInfo(
                // 标题
                "inttom的个人博客开发",
                // 描述
                "SpringBoot+Vue,第一次写项目",
                // 版本
                "版本内容：v1.0",
                // 组织链接
                "链接：暂无",
                // 联系人信息
                contact,
                // 许可
                "许可：The MIT License ",
                // 许可连接
                "许可链接：https://opensource.org/licenses/MIT",
                // 扩展
                new ArrayList<>()
        );
    }
}
