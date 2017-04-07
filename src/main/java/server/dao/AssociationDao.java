package server.dao;

import server.dao.interfaceDao.InterfaceDao;
import shared.dto.AssociationDto;

public interface AssociationDao extends InterfaceDao<AssociationDto> {
	
	AssociationDto getAssociation();

}
