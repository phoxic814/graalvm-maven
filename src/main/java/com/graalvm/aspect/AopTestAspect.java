package com.graalvm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTestAspect {

    @Pointcut("@annotation(com.graalvm.annotation.AopTest)")
    public void pointCut() {}

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aop test before");
        Object result = joinPoint.proceed();
        System.out.println("aop test after");
        return result;
    }
}
