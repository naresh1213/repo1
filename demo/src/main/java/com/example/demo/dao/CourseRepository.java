package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Course;

@Repository
public class CourseRepository {
	//@Autowired
	@PersistenceContext
	EntityManager entity;
	
	public Course findById(Integer id){
		return entity.find(Course.class, id);
	}

}
