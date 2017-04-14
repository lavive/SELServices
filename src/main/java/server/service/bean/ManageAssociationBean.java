package server.service.bean;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import server.dao.AssociationDaoLocal;
import server.service.ManageAssociationRemote;
import server.service.transform.DtoToEntity;
import server.service.transform.EntityToDto;
import shared.dto.AssociationDto;

@Stateless
public class ManageAssociationBean implements ManageAssociationRemote {
	
	@EJB
	private AssociationDaoLocal associationDao;

	
	@Override
	public void createAssociation(AssociationDto associationDto) {
		
		associationDao.create(DtoToEntity.associationDtoToEntity(associationDto));

	}

	@Override
	public void updateAssociation() {
		
		associationDao.update(associationDao.getAssociation());
		
	}

	@Override
	public AssociationDto retrieveAssociation() {
		
		return EntityToDto.associationEntityToDto(associationDao.getAssociation());
				
	}

}
