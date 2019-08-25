package com.et.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 指定调用服务
 *
 * @author E.T
 * @version 1.0
 * @Description feign接口类, 通过@ FeignClient（“服务名”），来指定调用哪个服务
 * @date 2017年05月19日
 * @updateby
 * @updatedate
 * @since 1.0
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
//断路由，如果调用的服务挂了，那么就会执行SchedualServiceHiHystric方法返回提示
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name) throws Exception;
}
