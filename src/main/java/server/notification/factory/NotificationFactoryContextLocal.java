package server.notification.factory;

import java.util.List;

import javax.ejb.Local;

import server.dao.entity.NotificationEntity;

@Local
public interface NotificationFactoryContextLocal {	
	
	public List<NotificationEntity> create(NotificationFactory notificationFactory);

}
