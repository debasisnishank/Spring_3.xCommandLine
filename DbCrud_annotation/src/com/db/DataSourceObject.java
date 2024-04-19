package com.db;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:/com/db/myapp.properties")
public class DataSourceObject {
	@Autowired
	public Environment env;
	
     public DataSource db;
     public DataSourceObject() {
         BasicDataSource bds = new BasicDataSource();
         bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
         bds.setUsername("root");
         bds.setPassword("root");
         bds.setUrl("jdbc:mysql://localhost:3310/cutm");
         db = (DataSource) bds;
     }
}
