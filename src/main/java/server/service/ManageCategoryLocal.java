package server.service;

import java.util.List;

import javax.ejb.Local;

import shared.dto.CategoryDto;

@Local
public interface ManageCategoryLocal {
	
	public void addCategory(CategoryDto categoryDto);
	
	public void deleteCategory(CategoryDto categoryDto);
	
	public List<CategoryDto> getCategories();

}
