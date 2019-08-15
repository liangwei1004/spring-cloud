package com.et;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication //配置名称一定要是bootstrap.yml 不能是application.yml
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
    @Value("${druid.url}")
    String url;
    @RequestMapping(value = "/hi")
    public String hi(){
        return url;
    }
}
