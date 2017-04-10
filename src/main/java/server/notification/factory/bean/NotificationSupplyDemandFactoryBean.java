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
import server.dao.entity.NotificationEntity;
import server.dao.entity.NotificationTopicEntity;
import server.dao.entity.SupplyDemandEntity;
import server.notification.constantes.EnumTopicNotification;
import server.notification.factory.NotificationSupplyDemandFactoryLocal;

@Singleton
@TransactionAttribute
public class NotificationSupplyDemandFactoryBean implements NotificationSupplyDemandFactoryLocal {
	@EJB
	private AssociationDaoLocal associationDao;
	
	@EJB
	private MemberDaoLocal memberDao;
		
	@PersistenceContext
	private EntityManager entityManager;
	
	private MemberEntity memberOrigin;
	
	@Override
	public void setMemberOrigin(MemberEntity member){
		this.memberOrigin = member;
	}
	
	private SupplyDemandEntity newDemand;
	
	@Override
	public void setNewDemand(SupplyDemandEntity demand){
		this.newDemand = demand;
	}
	
	private SupplyDemandEntity newSupply;
	
	@Override
	public void setNewSupply(SupplyDemandEntity supply){
		this.newSupply = supply;
	}
	
	@Override
	public List<NotificationEntity> create() {
		List<NotificationEntity> notifications = new ArrayList<NotificationEntity>();
		
		if(this.newDemand != null){
			NotificationEntity notificationNewDemand = createNewDemand();
		
			notifications.add(notificationNewDemand);
		}
		
		if(this.newSupply != null){
			NotificationEntity notificationNewSupply = createNewSupply();

			notifications.add(notificationNewSupply);
		}
		
		this.newDemand = null;
		this.newSupply = null;
		
		return notifications;
		
	}
	
	private NotificationEntity createNewDemand(){
		NotificationEntity notification = new NotificationEntity();
		NotificationTopicEntity notificationTopicEntity = new NotificationTopicEntity();
		
		AssociationEntity association = associationDao.getAssociation();
		
		String event = EnumTopicNotification.NEW_DEMAND.getWording();
		
		String category = this.newDemand.getCategory();
		
		String title = association.getName()+": "+event+" - "+category;
		
		String text = this.newDemand.getTitle()+" - "+this.memberOrigin.getForname()+
					" "+this.memberOrigin.getName();
		
		List<MemberEntity> memberToNotify = memberDao.getAllMembers();
		
		notificationTopicEntity.setEvent(event);
		notificationTopicEntity.setCategory(category);
		notificationTopicEntity.setPersonOriginEvent(this.memberOrigin);
		
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
	
	private NotificationEntity createNewSupply(){
		NotificationEntity notification = new NotificationEntity();
		NotificationTopicEntity notificationTopicEntity = new NotificationTopicEntity();
		
		AssociationEntity association = associationDao.getAssociation();
		
		String event = EnumTopicNotification.NEW_SUPPLY.getWording();
		
		String category = this.newSupply.getCategory();
		
		String title = association.getName()+": "+event+" - "+category;
		
		String text = this.newSupply.getTitle()+" - "+this.memberOrigin.getForname()+
					" "+this.memberOrigin.getName();
		
		List<MemberEntity> memberToNotify = memberDao.getAllMembers();
		
		notificationTopicEntity.setEvent(event);
		notificationTopicEntity.setCategory(category);
		notificationTopicEntity.setPersonOriginEvent(this.memberOrigin);
		
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
