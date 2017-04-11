package server.notification.suscriber;

import java.util.List;

import javax.ejb.Local;

import server.dao.entity.MemberEntity;
import server.dao.entity.NotificationEntity;

@Local
public interface SuscriberLocal {
	
	public void update(NotificationEntity notification);
	
	public List<MemberEntity> getMembersToNotify();
	
	public NotificationEntity getNotification();
	
	
	
}
