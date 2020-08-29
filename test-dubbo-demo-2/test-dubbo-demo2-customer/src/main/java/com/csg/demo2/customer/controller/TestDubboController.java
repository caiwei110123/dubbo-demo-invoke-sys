package com.csg.demo2.customer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.csg.demo2.api.service.TestDemo2DubboService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kid
 * @date 2020/8/20
 */

@Component
@RequestMapping("/")
public class TestDubboController {

    @Reference(version = "1.0.0")//该注解的作用就是订阅服务
    private TestDemo2DubboService testServices;


    @RequestMapping("/testDubbo")
    @ResponseBody
    public String testDubbo() throws Exception {
        System.out.println("TestDubboController---enter");
        return testServices.sayHello();
    }
}
