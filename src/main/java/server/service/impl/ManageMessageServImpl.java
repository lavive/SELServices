package server.service.impl;

import java.util.List;

import server.dao.MessageDao;
import server.notification.MessageForNotification;
import server.notification.NotificationFactory;
import server.service.ManageMessageServ;
import shared.dto.MemberDto;
import shared.dto.MessageDto;

public class ManageMessageServImpl implements ManageMessageServ {
	
	private MessageDao messageDao;

	@Override
	public NotificationFactory getNotificationFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageForNotification addMessage(MessageDto messageDto) {
		messageDao.create(messageDto);
		return null;
	}

	@Override
	public List<MessageDto> displayMessages() {
		
		return messageDao.getMessages();
	}

	@Override
	public List<MessageDto> displayMessages(MemberDto memberDto) {
		
		return messageDao.getMessages(memberDto);
	}

	@Override
	public MessageDto getMessageById(int id) {
		
		return messageDao.getMessageById(id);
	}

	@Override
	public void deleteMessage(MessageDto messageDto) {
		messageDao.delete(messageDto);

	}

	@Override
	public void deleteMessage() {
		
		messageDao.deleteMessage();

	}

	@Override
	public void deleteMessages(List<MessageDto> messageDtos) {
		
		messageDao.deleteMessages(messageDtos);

	}

	@Override
	public MessageDto notifyMembers(MessageForNotification message) {
		// TODO Auto-generated method stub
		return null;
	}

}
