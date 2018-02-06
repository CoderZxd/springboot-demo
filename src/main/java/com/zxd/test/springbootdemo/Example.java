package com.zxd.test.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

    @Value(value="${my.name}")
    private String myName;
    @RequestMapping("/")
    public String home(){
        return myName+" say 'Hello World!'";
    }

    @RequestMapping("/hello/{name}")
    String index(@PathVariable String name) {
        return "Hello "+name+"!!!";
    }
}
