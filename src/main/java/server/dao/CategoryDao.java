package server.dao;

import java.util.List;

import server.dao.interfaceDao.InterfaceDao;
import shared.dto.CategoryDto;

public interface CategoryDao extends InterfaceDao<CategoryDto> {
	
	public List<CategoryDto> getCategories();

}
