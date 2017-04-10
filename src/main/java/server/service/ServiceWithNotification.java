package server.service;

import server.notification.factory.NotificationFactory;

public interface ServiceWithNotification {
	
	NotificationFactory getNotificationFactory();

}
