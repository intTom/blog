package com.inttom.controller;


import com.inttom.service.IMUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author inttom
 * @since 2021-05-31
 */
@Controller
@RequestMapping("/mUser")
public class MUserController {
    @Autowired
    IMUserService imUserService;

    @GetMapping("/index")
    public Object index() {
        System.out.println(imUserService.getById(1L));
        return imUserService.getById(1L);
    }
}
