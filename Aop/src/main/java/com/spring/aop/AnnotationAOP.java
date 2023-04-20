package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationAOP {
	
	@Pointcut("execution(* egovframework.example..impl.*Impl.*(..))")
	private void pointcutMt() {
		// 포인트컷 내부에 선언 사항이 없어도 기본 생성자는 필요
	}
	
	@Around(value = "pointcutMt()") // 포인트컷 지정
	public Object logger(ProceedingJoinPoint jpt) throws Throwable{
		String signatureStr = jpt.getSignature().toShortString();
        System.out.println(signatureStr + "is start.");

        // 핵심기능 실행전 공통기능
        long st = System.currentTimeMillis();

        try{
            // 핵심기능
            Object obj = jpt.proceed();
            System.out.println("메서드 실행 성공!");
            return obj;
        } finally {
            // 핵심기능 실행후 공통기능
            long et = System.currentTimeMillis();
            System.out.println(signatureStr + "is finished.");
            System.out.println(signatureStr + "경과시간:" + (et - st));
        }
	}
}
