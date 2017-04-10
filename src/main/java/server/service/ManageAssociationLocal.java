package server.service;

import server.notification.MessageForNotification;
import javax.ejb.Local;
import shared.dto.AssociationDto;
import shared.dto.MessageDto;

@Local
public interface ManageAssociationLocal extends ServiceWithNotification{
	
	public void createAssociation(AssociationDto associationDto);
	
	public void deleteAssociation();
	
	public MessageForNotification updateAssociation();
	
	public AssociationDto getAssociation();
	
	public MessageDto notifyMembers(MessageForNotification message);

}
