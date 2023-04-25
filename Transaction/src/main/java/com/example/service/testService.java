package com.example.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional(propagation = Propagation.NEVER)
public class testService {
	
	private final HelloMapper helloMapper;
	
	public void updateTest(){
		helloMapper.update();
	}
}

