package server.notification.factory.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import server.dao.entity.NotificationEntity;
import server.notification.factory.NotificationFactory;
import server.notification.factory.NotificationFactoryContextLocal;
import server.notification.mediator.MediatorLocal;

@Singleton
public class NotificationFactoryContextBean implements NotificationFactoryContextLocal {
	
	@EJB
	private MediatorLocal mediator;

	@Override
	public List<NotificationEntity> create(NotificationFactory notificationFactory) {
		List<NotificationEntity> notifications = notificationFactory.create();
		for(NotificationEntity notification:notifications){
			mediator.sendNotification(notification);
		}
		return notifications;
	}

}
