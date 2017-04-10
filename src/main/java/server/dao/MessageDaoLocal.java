package server.dao;

import java.util.List;

import javax.ejb.Local;

import server.dao.entity.MailEntity;
import server.dao.entity.MessageEntity;
import server.dao.entity.PersonEntity;
import server.dao.entity.SmsEntity;
import server.dao.interfaces.InterfaceDao;

@Local
public interface MessageDaoLocal extends InterfaceDao<MessageEntity>{
	
	//public void createNotification(NotificationDto notificationDto);
	
	public List<MessageEntity> getMessageByState(boolean state);
	
	//public void deleteNotification(NotificationDto notificationDto);
	
	public void createSMS(MessageEntity messageEntity);
	
	public SmsEntity getSMS(MessageEntity messageEntity);
	
	public void deleteSMS(MessageEntity messageEntity);
	
	public void createMail(MessageEntity messageEntity);
	
	public MailEntity getMail(MessageEntity messageEntity);
	
	public void deleteMail(MessageEntity messageEntity);
	
	public List<MessageEntity> getMessages();
	
	public List<MessageEntity> getMessages(PersonEntity personEntity);
	
	public MessageEntity getMessageById(int id);
	
	public void deleteMessage();
	
	public void deleteMessages(List<MessageEntity> messageEntities);
	

}
