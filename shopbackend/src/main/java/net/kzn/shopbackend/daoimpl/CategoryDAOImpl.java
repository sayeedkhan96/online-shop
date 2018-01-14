package net.kzn.shopbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shopbackend.dao.CategoryDAO;
import net.kzn.shopbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		// add first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for Television");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		// add second category
		Category category1 = new Category();
		category1.setId(2);
		category1.setName("Mobile");
		category1.setDescription("This is some description for Mobile");
		category1.setImageURL("CAT_2.png");
		
		categories.add(category1);
		
		// add third category
		Category category11 = new Category();
		category11.setId(3);
		category11.setName("laptop");
		category11.setDescription("This is some description for Laptop");
		category11.setImageURL("CAT_3.png");
				
			categories.add(category11);
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		//enhanced for loop
		for(Category category : categories) {
			
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
