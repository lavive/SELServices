package server.service.bean;

import javax.ejb.Stateless;

import server.notification.MessageForNotification;
import server.notification.factory.NotificationFactory;
import server.service.ManageAssociationLocal;
import shared.dto.AssociationDto;
import shared.dto.MessageDto;

@Stateless
public class ManageAssociationBean implements ManageAssociationLocal {
	
	//private AssociationDaoLocal associationDao;

	@Override
	public NotificationFactory getNotificationFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createAssociation(AssociationDto associationDto) {
		//associationDao.create(associationDto);

	}

	@Override
	public void deleteAssociation() {
		//associationDao.delete(this.getAssociation());

	}

	@Override
	public MessageForNotification updateAssociation() {
		//associationDao.update(this.getAssociation());
		return null;
	}

	@Override
	public AssociationDto getAssociation() {
		
		return null;//associationDao.getAssociation();
	}

	@Override
	public MessageDto notifyMembers(MessageForNotification message) {
		// TODO Auto-generated method stub
		return null;
	}

}
