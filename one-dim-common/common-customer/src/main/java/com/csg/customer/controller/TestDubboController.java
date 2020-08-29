package com.csg.customer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.csg.api.service.TestCommonDubboService;
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
    private TestCommonDubboService testCommonDubboService;


    @RequestMapping("/testDubbo")
    @ResponseBody
    public String testDubbo() throws Exception {
        System.out.println("TestDubboController---enter");
        return testCommonDubboService.sayHello();
    }
}
