package com.csg.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.csg.api.service.TestCommonDubboService;

/**
 * @author kid
 * @date 2020/8/20
 */
@Service(version = "1.0.0")
public class TestCommonDubboServiceImpl implements TestCommonDubboService {


    @Override
    public String sayHello() {
        System.out.println("dubbo -> sayHello");
        return "hello world  common";
    }
}
