package server.service;

import java.util.List;

import javax.ejb.Remote;

import shared.dto.CategoryDto;

@Remote
public interface ManageCategoryRemote {
	
	public void addCategory(CategoryDto categoryDto);
	
	public void deleteCategory(int categoryId);
	
	public List<CategoryDto> retrieveAllCategories();

}
