package server.service.impl;

import java.util.List;

import server.dao.CategoryDao;
import server.service.ManageCategoryServ;
import shared.dto.CategoryDto;

public class ManageCategoryServImpl implements ManageCategoryServ {
	
	private CategoryDao categoryDao;

	@Override
	public void addCategory(CategoryDto categoryDto) {
		categoryDao.create(categoryDto);

	}

	@Override
	public void deleteCategory(CategoryDto categoryDto) {
		categoryDao.delete(categoryDto);

	}

	@Override
	public List<CategoryDto> getCategories() {
		
		return categoryDao.getCategories();
	}

}
