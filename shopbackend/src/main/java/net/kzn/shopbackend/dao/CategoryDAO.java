package net.kzn.shopbackend.dao;

import java.util.List;

import net.kzn.shopbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
}
