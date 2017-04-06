package server.service;

import server.notification.MessageForNotification;
import shared.AssociationDto;
import shared.NotificationDto;

public interface ManageAssociation extends ServiceWithNotification{
	
	public void createAssociation(AssociationDto associationDto);
	
	public void deleteAssociation();
	
	public MessageForNotification updateAssociation();
	
	public AssociationDto getAssociation();
	
	public NotificationDto notifyMembers(MessageForNotification message);

}
