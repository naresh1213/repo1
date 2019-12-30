package com.example.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
	@Resource
	JdbcTemplate temp;
	@Resource
	DataSource dataSource;
	
public void store(){
	String s="insert into school values('rrrr',3)";
	System.out.println(">>>>>>>>>..."+s);
	temp.setDataSource(dataSource);
	temp.execute(s);
	
	
}

}
