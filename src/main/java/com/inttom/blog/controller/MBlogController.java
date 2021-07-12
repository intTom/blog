package com.inttom.blog.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author inttom
 * @since 2021-06-07
 */
@RestController
@RequestMapping
public class MBlogController {

    @RequestMapping("/hello")
    public String hello() {
        return "你好";
    }

}
