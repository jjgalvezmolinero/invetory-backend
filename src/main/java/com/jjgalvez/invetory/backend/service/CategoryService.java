package com.jjgalvez.invetory.backend.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.jjgalvez.invetory.backend.model.Category;

@Service
public class CategoryService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CategoryService.class);
	@Autowired private JdbcTemplate jdbcTemplate;
	
	public List<Category> getCategories() {
		String query = "SELECT * FROM categories";
		return jdbcTemplate.query(query, Category.getMapper());
	}
}
