package com.example.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.HelloVO;
import com.example.service.HelloService;

@Controller
public class HelloController {
	
	@Resource(name = "helloService")
	HelloService helloService;
	
	@RequestMapping(value = "/helloWorld.do")
	public String SelectHelloList(Model model) throws Exception{
		
		List<HelloVO> helloList = helloService.selectHelloList();
		model.addAttribute("helloList",helloList);
		
		System.out.println("controller : " + helloList);
		
		return "HelloWorld";
		
	}

}
