package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationAOP {
	
	public static final Logger logger = LoggerFactory.getLogger(AnnotationAOP.class);
	
	@Pointcut("execution(* egovframework.example..impl.*Impl.*(..))")
	private void pointcutMt() {
		// 포인트컷 내부에 선언 사항이 없어도 기본 생성자는 필요
	}
	
	@Around(value = "pointcutMt()") // 포인트컷 지정
	public Object logger(ProceedingJoinPoint jpt) throws Throwable{
//		String signatureStr = jpt.getSignature().toShortString();
        // System.out.println(signatureStr + "is start.");
		logger.info("메서드 실행 전 로그");

        // 핵심기능 실행전 공통기능
        long st = System.currentTimeMillis();

        try{
            // 핵심기능
            Object obj = jpt.proceed();
            logger.info("메서드 실행 성공 로그");
            return obj;
        } finally {
        	logger.info("메서드 실행 완료 로그");
            // 핵심기능 실행후 공통기능
//            long et = System.currentTimeMillis();
//            System.out.println(signatureStr + "is finished.");
//            System.out.println(signatureStr + "경과시간:" + (et - st));
        }
	}
}
