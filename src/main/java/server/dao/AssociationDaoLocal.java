package server.dao;

import javax.ejb.Local;

import server.dao.entity.AssociationEntity;
import server.dao.interfaces.InterfaceDao;

@Local
public interface AssociationDaoLocal extends InterfaceDao<AssociationEntity> {
	
	AssociationEntity getAssociation();

}
