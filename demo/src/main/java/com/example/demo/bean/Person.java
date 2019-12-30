package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name="tab", initialValue=10, allocationSize=1000)

 
public class Person {
	@Id
	 //@SequenceGenerator(schema = "hr", name = "oraclehr_Company_seq", sequenceName  = "ISEQ$$_73886", allocationSize = 1)
 @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	public Person(){
		
	}
	public Person(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public Person(String name, String location) {
		super();
	
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location+"]";
	}

}
