package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bean.Course;
import com.example.demo.bean.Person;
import com.example.demo.dao.CourseRepository;
import com.example.demo.dao.EmpRepo;
import com.example.demo.dao.PersonJpaRepository;

@SpringBootApplication
public class DemoApplication {
	
	@Resource
	TestDao test;
	@Resource
	EmpRepo emp;
	@Resource
	PersonJpaRepository repository;
	@Resource
	CourseRepository repo;
	
	Logger log=LoggerFactory.getLogger(this.getClass());
	@PostConstruct
	public void store(){
		/*System.out.println("----------->instore");
		Person p=repository.findById(1);
		System.out.println(p);
		
		repository.update(new Person("naresh","ram"));*/
		
		Course c=repo.findById(1);
		//log.info("Course for 1--->{}",c);
		
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
