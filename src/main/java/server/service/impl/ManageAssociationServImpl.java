package server.service.impl;

import server.dao.AssociationDao;
import server.notification.MessageForNotification;
import server.notification.NotificationFactory;
import server.service.ManageAssociationServ;
import shared.dto.AssociationDto;
import shared.dto.MessageDto;

public class ManageAssociationServImpl implements ManageAssociationServ {
	
	private AssociationDao associationDao;

	@Override
	public NotificationFactory getNotificationFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createAssociation(AssociationDto associationDto) {
		associationDao.create(associationDto);

	}

	@Override
	public void deleteAssociation() {
		associationDao.delete(this.getAssociation());

	}

	@Override
	public MessageForNotification updateAssociation() {
		associationDao.update(this.getAssociation());
		return null;
	}

	@Override
	public AssociationDto getAssociation() {
		
		return associationDao.getAssociation();
	}

	@Override
	public MessageDto notifyMembers(MessageForNotification message) {
		// TODO Auto-generated method stub
		return null;
	}

}
