package server.service.bean;

import java.util.List;

import javax.ejb.Stateless;

import server.notification.MessageForNotification;
import server.notification.factory.NotificationFactory;
import server.service.ManageSupplyDemandLocal;
import shared.dto.MemberDto;
import shared.dto.MessageDto;
import shared.dto.SupplyDemandDto;

@Stateless
public class ManageSupplyDemandBean implements ManageSupplyDemandLocal {
	
	//private SupplyDemandDaoLocal supplyDemandDao;

	@Override
	public NotificationFactory getNotificationFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageForNotification addSupplyDemand(SupplyDemandDto supplyDemandDto) {
		//supplyDemandDao.create(supplyDemandDto);
		return null;
	}

	@Override
	public List<SupplyDemandDto> displaySupplyDemand() {
		
		return null;//supplyDemandDao.getAllSupplyDemand();
	}

	@Override
	public List<SupplyDemandDto> displaySupplyDemand(MemberDto memberDto) {
		
		return null;//supplyDemandDao.getSupplyDemand(memberDto);
	}

	@Override
	public SupplyDemandDto getSupplyDemandById(int id) {
		
		return null;//supplyDemandDao.getSupplyDemandById(id);
	}

	@Override
	public void deleteSupplyDemand(SupplyDemandDto supplyDemandDto) {
		
		//supplyDemandDao.delete(supplyDemandDto);

	}

	@Override
	public MessageForNotification updateSupplyDemand(SupplyDemandDto supplyDemandDto) {
		//supplyDemandDao.update(supplyDemandDto);
		return null;
	}

	@Override
	public MessageDto notifyMembers(MessageForNotification message) {
		// TODO Auto-generated method stub
		return null;
	}

}
