package server.notification.publishSuscribe;

import server.notification.TopicNotification;

public interface Suscriber {
	
	public void update(String notification);
	
	public TopicNotification getTopic();
}
