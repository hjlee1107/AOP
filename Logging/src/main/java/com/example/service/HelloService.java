package com.example.service;

import java.util.List;

import com.example.model.HelloVO;

public interface HelloService {
	
	String hong = "hong123";
	
	List<HelloVO> selectHelloList() throws Exception;
	
	String selectUser() throws Exception;
	
	void insert(HelloVO vo) throws Exception;
	void update(HelloVO vo) throws Exception;
	

}
