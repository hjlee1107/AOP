package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
    public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
        String signatureStr = joinpoint.getSignature().toShortString();
        System.out.println(signatureStr + "is start.");

        // 핵심기능 실행전 공통기능
        long st = System.currentTimeMillis();

        try{
            // 핵심기능
            Object obj = joinpoint.proceed();
            System.out.println("메서드 실행 성공!");
            return obj;
        } finally {
            // 핵심기능 실행후 공통기능
            long et = System.currentTimeMillis();
            System.out.println(signatureStr + "is finished.");
            System.out.println(signatureStr + "경과시간:" + (et - st));
        }
    }
    
    public void beforeLog(JoinPoint jpt) throws Throwable{
    	System.out.println("Before 실행");
    	
    }
    
    public void afterLog(JoinPoint jpt) throws Throwable{
    	System.out.println("After 실행");
    }
    
    public void returnLog(JoinPoint jpt) throws Throwable{
    	System.out.println("AfterReturning 실행");
    }
    
}