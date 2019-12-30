package com.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.bean.Student;

@RestController
public class TestService { 
	@Resource
	Student	student;

	ModelAndView modelAndView=new ModelAndView();
@GetMapping("/display")
public Student dispay(){
	student.setId(1);
	student.setName("naresh");
	return student;
}
}
