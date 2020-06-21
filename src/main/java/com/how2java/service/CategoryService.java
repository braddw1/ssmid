package com.how2java.service;

import com.how2java.pojo.Category;
import com.how2java.util.Page;

import java.util.List;

public interface CategoryService {

	List<Category> list();
	int total();
	List<Category> list(Page page);
	void add(Category c);
	void update(Category c);
	void delete(Category c);
	Category get(int id);
	void addTwo();

	void deleteAll();
}
