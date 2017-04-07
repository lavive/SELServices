package server.dao;

import java.util.List;

import server.dao.interfaceDao.InterfaceDao;
import shared.dto.MailDto;
import shared.dto.MemberDto;
import shared.dto.MessageDto;
import shared.dto.SmsDto;

public interface MessageDao extends InterfaceDao<MessageDto>{
	
	//public void createNotification(NotificationDto notificationDto);
	
	public List<MessageDto> getMessageByState(boolean state);
	
	//public void deleteNotification(NotificationDto notificationDto);
	
	public void createSMS(MessageDto messageDto);
	
	public SmsDto getSMS(MessageDto messageDto);
	
	public void deleteSMS(MessageDto messageDto);
	
	public void createMail(MessageDto messageDto);
	
	public MailDto getMail(MessageDto messageDto);
	
	public void deleteMail(MessageDto messageDto);
	
	public List<MessageDto> getMessages();
	
	public List<MessageDto> getMessages(MemberDto memberDto);
	
	public MessageDto getMessageById(int id);
	
	public void deleteMessage();
	
	public void deleteMessages(List<MessageDto> messageDtos);
	

}
