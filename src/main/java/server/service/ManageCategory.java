package server.service;

import java.util.List;

import shared.CategoryDto;

public interface ManageCategory {
	
	public void addCategory(CategoryDto categoryDto);
	
	public void deleteCategory(CategoryDto categoryDto);
	
	public List<CategoryDto> getCategories();

}
