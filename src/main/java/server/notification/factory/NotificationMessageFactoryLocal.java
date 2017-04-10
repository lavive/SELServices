package server.notification.factory;

import javax.ejb.Local;

import server.dao.entity.MessageEntity;

@Local
public interface NotificationMessageFactoryLocal extends NotificationFactory {
	
	public void setMessage(MessageEntity message);

}
