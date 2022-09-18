package com.jjgalvez.invetory.backend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jjgalvez.invetory.backend.model.Category;
import com.jjgalvez.invetory.backend.service.CategoryService;


@RestController
public class CategoryController {
	@Autowired CategoryService service;
	
	@GetMapping("/categories")
	public List<Category> getCategories() {
		return service.getCategories();
	}
	
	@GetMapping("/category")
	public Category getCategory(@RequestParam Long id) {
		return service.getCategory(id);
	}

}
