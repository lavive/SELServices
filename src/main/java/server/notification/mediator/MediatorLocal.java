package server.notification.mediator;

import java.util.List;

import javax.ejb.Local;

import server.dao.entity.NotificationEntity;
import server.notification.suscriber.SuscriberLocal;

@Local
public interface MediatorLocal {
	
	public List<SuscriberLocal> getSuscribers();
	
	public void sendNotification(NotificationEntity notification);
}
