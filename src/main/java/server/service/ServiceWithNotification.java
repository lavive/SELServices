package server.service;

import server.notification.NotificationFactory;

public interface ServiceWithNotification {
	
	NotificationFactory getNotificationFactory();

}
