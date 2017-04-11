package server.notification.suscriber.interceptor;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import server.dao.NotificationsMemberDaoLocal;
import server.dao.entity.MemberEntity;
import server.dao.entity.NotificationEntity;
import server.dao.entity.NotificationsMemberEntity;
import server.notification.suscriber.SuscriberLocal;

public class SuscriberForAppInterceptor {
	
	@EJB
	NotificationsMemberDaoLocal notificationsMemberDao;
	
	@AroundInvoke
	public Object updateNotificationsMember(InvocationContext ic) throws Exception {
		Object result = ic.proceed();
		
		SuscriberLocal suscriber = (SuscriberLocal) ic.getTarget();
		
		List<NotificationsMemberEntity> notificationsMembers = this.notificationsMemberDao.getAllNotificationsMember();
		if(notificationsMembers == null){
			this.notificationsMemberDao.initialise();
			notificationsMembers = this.notificationsMemberDao.getAllNotificationsMember();
		}
		
		for(MemberEntity member:suscriber.getMembersToNotify()){
			NotificationsMemberEntity notificationsMember= isInside(member,notificationsMembers);
			if(notificationsMember != null){
				if(notificationsMember.getNotifications() != null){
					notificationsMember.getNotifications().add(suscriber.getNotification());
				}
				else{
					List<NotificationEntity> newNotifications = new ArrayList<NotificationEntity>();
					newNotifications.add(suscriber.getNotification());
					notificationsMember.setNotifications(newNotifications);
				}
				this.notificationsMemberDao.update(notificationsMember);
			}else{
				notificationsMember = new NotificationsMemberEntity();
				List<NotificationEntity> newNotifications = new ArrayList<NotificationEntity>();
				newNotifications.add(suscriber.getNotification());
				notificationsMember.setNotifications(newNotifications);
				notificationsMember.setMember(member);
				this.notificationsMemberDao.create(notificationsMember);
			}
			
		}
		
		return result;
		
	}
	
	private NotificationsMemberEntity isInside(MemberEntity member, List<NotificationsMemberEntity> notificationsMembers){
		
		if(notificationsMembers != null){
			for(NotificationsMemberEntity notificationsMember:notificationsMembers){
				if(member.getId().equals(notificationsMember.getMember().getId()))
						return notificationsMember;
			}
		}
		return null;
	}
}
