package com.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.HelloVO;


@Service("helloService")
public class HelloServiceImpl extends EgovAbstractServiceImpl implements HelloService{
	
	@Resource(name = "helloMapper")
	private HelloMapper helloMapper;
	
	@Override
	public List<HelloVO> selectHelloList() throws Exception {
		
		System.out.println("service : " + helloMapper.selectHelloList());
		
		return helloMapper.selectHelloList();
		
	}
	
	@Override
	public String selectUser() throws Exception {
		
		return helloMapper.selectUser();
	}

	@Override
	public void insert(HelloVO vo) throws Exception {
		helloMapper.insert(vo);
	}

	@Override
	public void update(HelloVO vo) throws Exception {
		helloMapper.update();
	}
	

	
	

}
