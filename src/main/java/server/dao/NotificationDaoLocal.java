package server.dao;

import java.util.List;

import javax.ejb.Local;

import server.dao.entity.MemberEntity;
import server.dao.entity.NotificationEntity;
import server.dao.interfaces.InterfaceDao;

@Local
public interface NotificationDaoLocal extends InterfaceDao<NotificationEntity> {
	
	public List<NotificationEntity> create(List<NotificationEntity> notifications);
	
	public void addNotification(MemberEntity memberEntity,NotificationEntity notificationEntity);
	
	public NotificationEntity getNotification(MemberEntity memberEntity,NotificationEntity notificationEntity);	

	public List<NotificationEntity> getNotifications(MemberEntity memberEntity);
	
	public List<MemberEntity> getMembers(NotificationEntity notificationEntity);
	
	public void deleteNotification(MemberEntity memberEntity);
	
	public void deleteNotification(MemberEntity memberEntity,NotificationEntity notificationEntity);
	
}
