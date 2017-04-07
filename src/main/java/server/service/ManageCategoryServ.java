package server.service;

import java.util.List;

import shared.dto.CategoryDto;

public interface ManageCategoryServ {
	
	public void addCategory(CategoryDto categoryDto);
	
	public void deleteCategory(CategoryDto categoryDto);
	
	public List<CategoryDto> getCategories();

}
