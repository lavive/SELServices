package server.notification.factory.bean;

import java.util.List;

import javax.ejb.Stateless;

import server.dao.entity.NotificationEntity;
import server.notification.factory.NotificationFactory;
import server.notification.factory.NotificationFactoryContextLocal;

@Stateless
public class NotificationFactoryContextBean implements NotificationFactoryContextLocal {

	@Override
	public List<NotificationEntity> create(NotificationFactory notificationFactory) {
		
		return notificationFactory.create();
	}

}
