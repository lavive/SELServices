package server.service.impl;

import java.util.List;

import server.dao.SupplyDemandDao;
import server.notification.MessageForNotification;
import server.notification.NotificationFactory;
import server.service.ManageSupplyDemandServ;
import shared.dto.MemberDto;
import shared.dto.MessageDto;
import shared.dto.SupplyDemandDto;

public class ManageSupplyDemandServImpl implements ManageSupplyDemandServ {
	
	private SupplyDemandDao supplyDemandDao;

	@Override
	public NotificationFactory getNotificationFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageForNotification addSupplyDemand(SupplyDemandDto supplyDemandDto) {
		supplyDemandDao.create(supplyDemandDto);
		return null;
	}

	@Override
	public List<SupplyDemandDto> displaySupplyDemand() {
		
		return supplyDemandDao.getAllSupplyDemand();
	}

	@Override
	public List<SupplyDemandDto> displaySupplyDemand(MemberDto memberDto) {
		
		return supplyDemandDao.getSupplyDemand(memberDto);
	}

	@Override
	public SupplyDemandDto getSupplyDemandById(int id) {
		
		return supplyDemandDao.getSupplyDemandById(id);
	}

	@Override
	public void deleteSupplyDemand(SupplyDemandDto supplyDemandDto) {
		
		supplyDemandDao.delete(supplyDemandDto);

	}

	@Override
	public MessageForNotification updateSupplyDemand(SupplyDemandDto supplyDemandDto) {
		supplyDemandDao.update(supplyDemandDto);
		return null;
	}

	@Override
	public MessageDto notifyMembers(MessageForNotification message) {
		// TODO Auto-generated method stub
		return null;
	}

}
