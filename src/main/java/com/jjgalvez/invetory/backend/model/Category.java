package com.jjgalvez.invetory.backend.model;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Category {
	
	private Long id;
	private String name;
	private String description;
	
	public Category() {}
	
	public Category(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	public static CategoryMapper getMapper() {
		return new CategoryMapper();
	}
}

class CategoryMapper implements RowMapper<Category> {
	@Override
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		if(rs == null) {
			return new Category();
		}
		
		return new Category(
				rs.getLong("id"), rs.getString("name"), rs.getString("description")
				);
	}
}
