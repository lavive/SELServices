package server.dao;

import java.util.List;

import javax.ejb.Local;

import server.dao.entity.NotificationEntity;
import server.dao.interfaces.InterfaceDao;

@Local
public interface NotificationDaoLocal extends InterfaceDao<NotificationEntity> {
	
	public List<NotificationEntity> create(List<NotificationEntity> notifications);
	
	public NotificationEntity getNotification(int notificationId);
	
}
