package server.notification.factory;

import javax.ejb.Local;

import server.dao.entity.MemberEntity;
import server.dao.entity.SupplyDemandEntity;

@Local
public interface NotificationSupplyDemandFactoryLocal extends NotificationFactory {

	public void setMemberOrigin(MemberEntity member);
		
	public void setNewDemand(SupplyDemandEntity demand);
	
	public void setNewSupply(SupplyDemandEntity supply);
}
