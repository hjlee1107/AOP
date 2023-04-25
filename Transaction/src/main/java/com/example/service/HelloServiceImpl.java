package com.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.HelloVO;


@Service("helloService")
@Transactional
public class HelloServiceImpl extends EgovAbstractServiceImpl implements HelloService{
	
	@Resource(name = "helloMapper")
	private HelloMapper helloMapper;
	
	private testService service;
	
	@Override
	public void trans(HelloVO vo){
		helloMapper.insert(vo);
//		updateTest();
		service.updateTest();
	}
	
//	@Transactional(propagation = Propagation.NEVER)
//	public void updateTest(){
//		helloMapper.update();
//	}

	
	

}
