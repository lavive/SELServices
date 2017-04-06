package server.dao;

import java.util.List;

import server.dao.interfaceDao.InterfaceDao;
import shared.MailDto;
import shared.NotificationDto;
import shared.SmsDto;

public interface NotificationDao extends InterfaceDao<NotificationDto>{
	
	//public void createNotification(NotificationDto notificationDto);
	
	public List<NotificationDto> getNotificationByState(boolean state);
	
	//public void deleteNotification(NotificationDto notificationDto);
	
	public void createSMS(NotificationDto notificationDto);
	
	public SmsDto getSMS(NotificationDto notificationDto);
	
	public void deleteSMS(NotificationDto notificationDto);
	
	public void createMail(NotificationDto notificationDto);
	
	public MailDto getMail(NotificationDto notificationDto);
	
	public void deleteMail(NotificationDto notificationDto);
	

}
