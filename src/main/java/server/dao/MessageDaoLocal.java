package server.dao;

import java.util.List;

import javax.ejb.Local;

import server.dao.entity.MessageEntity;
import server.dao.entity.PersonEntity;
import server.dao.interfaces.InterfaceDao;

@Local
public interface MessageDaoLocal extends InterfaceDao<MessageEntity>{
	
	public List<MessageEntity> getMessageByState(boolean state);
	
	public List<MessageEntity> getMessages();
	
	public List<MessageEntity> getMessages(PersonEntity personEntity);
	
	public MessageEntity getMessageById(int id);
	
	public void deleteMessage();
	
	public void deleteMessages(List<MessageEntity> messageEntities);
	

}
