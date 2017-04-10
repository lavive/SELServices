package server.service;

import java.util.List;

import javax.ejb.Local;

import server.notification.MessageForNotification;
import shared.dto.MemberDto;
import shared.dto.MessageDto;

@Local
public interface ManageMessageLocal extends ServiceWithNotification{
	
	public MessageForNotification addMessage(MessageDto messageDto);
	
	public List<MessageDto> displayMessages();
	
	public List<MessageDto> displayMessages(MemberDto memberDto);
	
	public MessageDto getMessageById(int id);
	
	public void deleteMessage(MessageDto messageDto);
	
	public void deleteMessage();

	public void deleteMessages(List<MessageDto> messageDtos);
	
	public MessageDto notifyMembers(MessageForNotification message);

}
