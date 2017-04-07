package server.service;

import server.notification.MessageForNotification;
import shared.dto.AssociationDto;
import shared.dto.MessageDto;

public interface ManageAssociationServ extends ServiceWithNotification{
	
	public void createAssociation(AssociationDto associationDto);
	
	public void deleteAssociation();
	
	public MessageForNotification updateAssociation();
	
	public AssociationDto getAssociation();
	
	public MessageDto notifyMembers(MessageForNotification message);

}
