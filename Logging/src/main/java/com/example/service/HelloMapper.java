package com.example.service;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.example.model.HelloVO;


@Mapper("helloMapper")
public interface HelloMapper{
	List<HelloVO> selectHelloList() throws Exception;
	
	String selectUser() throws Exception;
	
	void insert(HelloVO vo) throws Exception;
	void update() throws Exception;
}
