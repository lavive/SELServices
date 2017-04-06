package server.notification.publishSuscribe;

import java.util.List;

import server.notification.MessageForNotification;
import server.notification.TopicNotification;

public interface Mediator {
	
	public void add(Suscriber suscriber);
	
	public void remove(Suscriber suscriber);
	
	public void sendMessage(MessageForNotification message);

	public List<Suscriber> getSuscribers(TopicNotification topic);
}
