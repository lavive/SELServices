package server.service;

import java.util.List;

import server.notification.MessageForNotification;
import shared.MemberDto;
import shared.NotificationDto;

public interface ManageMessage extends ServiceWithNotification{
	
	public MessageForNotification addMessage(NotificationDto notificationDto);
	
	public List<NotificationDto> displayMessages();
	
	public List<NotificationDto> displayMessages(MemberDto memberDto);
	
	public NotificationDto getNotificationById(int id);
	
	public void deleteNotification(NotificationDto notificationDto);
	
	public void deleteNotifications();

	public void deleteNotifications(List<NotificationDto> notificationDtos);
	
	public NotificationDto notifyMembers(MessageForNotification message);

}
