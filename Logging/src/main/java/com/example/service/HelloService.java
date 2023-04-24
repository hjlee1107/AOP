package com.example.service;

import java.util.List;

import com.example.model.HelloVO;


public interface HelloService {
	
	List<HelloVO> selectHelloList() throws Exception;

}
