package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	@PersistenceContext
	EntityManager entiry;
	public Person findById(int id){
		return entiry.find(Person.class, id);
	}
	public void update(Person person){
		 entiry.persist(person);;
	}


}
