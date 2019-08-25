package com.et.controller;

import com.et.remote.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author E.T
 * @version 1.0
 * @Description
 * @date 2017年05月19日
 * @updateby
 * @updatedate
 * @since 1.0
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) throws Exception {
        return schedualServiceHi.sayHiFromClientOne(name);//远程调用
    }
}
