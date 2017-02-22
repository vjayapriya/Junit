package com.jayapriya.bookapp.util;

import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jayapriya.bookapp.model.Book;

public class ConnectionUtil {
	public static BasicDataSource dataSource() {

		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/books_db");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;

	}

	public static JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}
	
	

}
