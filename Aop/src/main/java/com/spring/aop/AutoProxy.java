package com.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AutoProxy {
	
	@Bean AnnotationAOP anntationaop() {
		return new AnnotationAOP();
	}
	
}
