package com.graalvm.controller;

import com.graalvm.service.AopService;
import com.graalvm.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AopController {

    private final AopService aopService;

    private final CacheService cacheService;

    @GetMapping("aop/test")
    public String test() {
        return aopService.test();
    }
}
