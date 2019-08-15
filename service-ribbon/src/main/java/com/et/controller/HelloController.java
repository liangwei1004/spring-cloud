package com.et.controller;

import com.et.service.HelloSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 * @Description 
 * @author E.T
 * @date 2017年05月19日
 * @updateby
 * @updatedate
 * @version 1.0
 * @since 1.0
 */
@RestController
public class HelloController {

    @Autowired
    HelloSerivce helloSerivce;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) throws Exception {
        return helloSerivce.hiService(name);
    }
        
}
