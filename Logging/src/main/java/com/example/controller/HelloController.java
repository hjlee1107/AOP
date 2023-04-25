package com.example.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value = "/insert.do")
	public void Transaction(@RequestParam("user_id")String user_id, 
							@RequestParam("user_name")String user_name, 
							@RequestParam("user_email")String user_email,
							HelloVO vo) throws Exception {
		
		System.out.println("컨트롤러 진입");
		
		vo.setUser_id(user_id);
		vo.setUser_name(user_name);
		vo.setUser_email(user_email);
		
		System.out.println("id : " + user_id);
		System.out.println("name : " + user_name);
		System.out.println("email : " + user_email);
		
		helloService.insert(vo);
		
	}
	
	

}
