package com.et.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 测试负载均衡
 *
 * @author E.T
 * @version 1.0
 * @Description 通过restTemplate.getForObject方法，service-ribbon 就可以调用service-hi的方法了。并且在调用的工程中并之需要写服务的名，而不是具体的ip.
 * @date 2017年05月19日
 * @updateby
 * @updatedate
 * @since 1.0
 */
@Service
public class HelloSerivce {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError") //断路由，如果调用的服务挂了，那么就会执行hiError方法返回提示
    public String hiService(String name) throws Exception{
        return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
    }
    public String hiError(String name){
        return "hehe "+name+" is error...";
    }
}
