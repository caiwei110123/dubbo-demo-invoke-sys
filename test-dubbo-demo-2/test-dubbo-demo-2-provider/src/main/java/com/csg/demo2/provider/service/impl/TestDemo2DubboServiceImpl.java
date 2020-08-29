package com.csg.demo2.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.csg.api.service.TestCommonDubboService;
import com.csg.demo2.api.service.TestDemo2DubboService;

/**
 * @author kid
 * @date 2020/8/20
 */
@Service(version = "1.0.0")
public class TestDemo2DubboServiceImpl implements TestDemo2DubboService {
    @Reference(version = "1.0.0")//该注解的作用就是订阅服务
    private TestCommonDubboService testCommonDubboService;


    @Override
    public String sayHello() {
        System.out.println("dubbo -> sayHello");
        String result = testCommonDubboService.sayHello();
        System.out.println("RPC invoke result : " + result);
        return "hello world";
    }
}
