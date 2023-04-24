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
		logger.info("메서드 진입 전 로그");
		//System.out.println("메서드 실행");
		
		try {
			long after = System.currentTimeMillis();
			Object ob = jpt.proceed();
			logger.info("메서드 진입 후 로그" + (after-before));
			//System.out.println("메서드 실행 시간 : " + (after-before));
			
			return ob;
			
		} finally {
			logger.info("메서드 종료 로그");
			//System.out.println("메서드 실행 종료");
		}
	}
}
