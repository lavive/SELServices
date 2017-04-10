package server.service.bean;

import java.util.List;

import javax.ejb.Stateless;

import server.notification.MessageForNotification;
import server.notification.factory.NotificationFactory;
import server.service.ManageMessageLocal;
import shared.dto.MemberDto;
import shared.dto.MessageDto;

@Stateless
public class ManageMessageBean implements ManageMessageLocal {
	
	//private MessageDaoLocal messageDao;

	@Override
	public NotificationFactory getNotificationFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageForNotification addMessage(MessageDto messageDto) {
		//messageDao.create(messageDto);
		return null;
	}

	@Override
	public List<MessageDto> displayMessages() {
		
		return null;//messageDao.getMessages();
	}

	@Override
	public List<MessageDto> displayMessages(MemberDto memberDto) {
		
		return null;//messageDao.getMessages(memberDto);
	}

	@Override
	public MessageDto getMessageById(int id) {
		
		return null;//messageDao.getMessageById(id);
	}

	@Override
	public void deleteMessage(MessageDto messageDto) {
		//messageDao.delete(messageDto);

	}

	@Override
	public void deleteMessage() {
		
		//messageDao.deleteMessage();

	}

	@Override
	public void deleteMessages(List<MessageDto> messageDtos) {
		
		//messageDao.deleteMessages(messageDtos);

	}

	@Override
	public MessageDto notifyMembers(MessageForNotification message) {
		// TODO Auto-generated method stub
		return null;
	}

}
