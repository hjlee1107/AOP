package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AspectAOP {

	public static final Logger logger = LoggerFactory.getLogger(AspectAOP.class);
	
	@Around(value = "execution(* com.example..service.*Service.*(..))")
	public Object AroundLog(ProceedingJoinPoint jpt) throws Throwable{
		
		long before = System.currentTimeMillis();
		//System.out.println("메서드 실행");
		
		try {
			long after = System.currentTimeMillis();
			Object ob = jpt.proceed();
			//System.out.println("메서드 실행 시간 : " + (after-before));
			
			return ob;
			
		} finally {
			//System.out.println("메서드 실행 종료");
		}
	}
}
