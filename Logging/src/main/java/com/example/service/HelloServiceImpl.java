package com.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import com.example.model.HelloVO;


@Service("helloService")
public class HelloServiceImpl extends EgovAbstractServiceImpl implements HelloService{
	
	@Resource(name = "helloMapper")
	HelloMapper helloMapper;

	@Override
	public List<HelloVO> selectHelloList() throws Exception {
		
		System.out.println("service : " + helloMapper.selectHelloList());
		
		return helloMapper.selectHelloList();
		
	}
	
	

}
