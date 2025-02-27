package com.graalvm.service;

import com.graalvm.annotation.AopTest;
import org.springframework.stereotype.Service;

@Service
public class AopServiceImpl implements AopService {

    @Override
    @AopTest
    public String test() {
        return "test";
    }
}
