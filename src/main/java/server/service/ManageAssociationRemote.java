package server.service;

import javax.ejb.Remote;

import shared.dto.AssociationDto;

@Remote
public interface ManageAssociationRemote{
	
	public void createAssociation(AssociationDto associationDto);
	
	public void updateAssociation();
	
	public AssociationDto retrieveAssociation();

}
