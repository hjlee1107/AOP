package com.sample.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.service.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:xml/*.xml"})
public class UserTest {
	
	private HelloService test;
	
	@Resource(name = "helloService")
	public void setHelloService(HelloService hello) {
		this.test = hello;
	}
	
	@Test
	public void test() throws Exception {
		String result = test.selectUser();
		assertEquals("홍길동", result);
	}
	
}
