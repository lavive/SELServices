package server.notification.factory;

import javax.ejb.Local;

import server.dao.entity.MemberEntity;

@Local
public interface NotificationMemberFactoryLocal extends NotificationFactory {
	
	public void setNewMember(MemberEntity member);
	public void setMemberLeaving(MemberEntity member);

}
