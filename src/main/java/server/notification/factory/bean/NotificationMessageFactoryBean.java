package server.notification.factory.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import server.dao.AssociationDaoLocal;
import server.dao.MemberDaoLocal;
import server.dao.entity.AssociationEntity;
import server.dao.entity.MemberEntity;
import server.dao.entity.MessageEntity;
import server.dao.entity.NotificationEntity;
import server.dao.entity.NotificationTopicEntity;
import server.notification.constantes.EnumTopicNotification;
import server.notification.factory.NotificationMessageFactoryLocal;

@Singleton
@TransactionAttribute
public class NotificationMessageFactoryBean implements NotificationMessageFactoryLocal {

	@EJB
	private AssociationDaoLocal associationDao;
	
	@EJB
	private MemberDaoLocal memberDao;
		
	@PersistenceContext
	private EntityManager entityManager;
	
	private MessageEntity message;
	
	@Override
	public void setMessage(MessageEntity message){
		this.message = message;
	}
			
	@Override
	public List<NotificationEntity> create() {
		List<NotificationEntity> notifications = new ArrayList<NotificationEntity>();
		
		NotificationEntity notification = createNewMessage();
		
		notifications.add(notification);
		
		return notifications;
		
		
	}
	
	private NotificationEntity createNewMessage(){
		NotificationEntity notification = new NotificationEntity();
		NotificationTopicEntity notificationTopicEntity = new NotificationTopicEntity();
		
		AssociationEntity association = associationDao.getAssociation();
		
		String event = EnumTopicNotification.NEW_MESSAGE.getWording();
		
		String category = null;
		
		String origin = null;
		if(this.message.getTransmitterPerson() instanceof MemberEntity){
			origin = ((MemberEntity) this.message.getTransmitterPerson()).getForname()+
					" "+this.message.getTransmitterPerson().getName();
		}
		else{
			origin = "Le Bureau";
		}
				
		String title = association.getName()+": "+event+" ("+origin+")";
		
		String text = this.message.getText();
		
		List<MemberEntity> memberToNotify = memberDao.getAllMembers();
		
		notificationTopicEntity.setTopic(event);
		notificationTopicEntity.setCategory(category);
		notificationTopicEntity.setPersonOriginEvent(this.message.getTransmitterPerson());
		
		this.entityManager.persist(notificationTopicEntity);
		this.entityManager.flush();
		
		notification.setMembresToNotify(memberToNotify);
		notification.setText(text);
		notification.setTitle(title);
		notification.setTopic(notificationTopicEntity);
		
		this.entityManager.persist(notification);
		this.entityManager.flush();
		
		return notification;
	}

}
