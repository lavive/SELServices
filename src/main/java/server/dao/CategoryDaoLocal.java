package server.dao;

import java.util.List;

import javax.ejb.Local;

import server.dao.entity.CategoryEntity;
import server.dao.interfaces.InterfaceDao;

@Local
public interface CategoryDaoLocal extends InterfaceDao<CategoryEntity> {
	
	public List<CategoryEntity> getCategories();

}
