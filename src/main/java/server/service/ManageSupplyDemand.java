package server.service;

import java.util.List;

import server.notification.MessageForNotification;
import shared.MemberDto;
import shared.NotificationDto;
import shared.SupplyDemandDto;

public interface ManageSupplyDemand extends ServiceWithNotification{

	public MessageForNotification addSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	public List<SupplyDemandDto> displaySupplyDemand();
	
	public List<SupplyDemandDto> displaySupplyDemand(MemberDto memberDto);
	
	public SupplyDemandDto getSupplyDemandById(int id);
	
	public void deleteSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	public MessageForNotification updateSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	public NotificationDto notifyMembers(MessageForNotification message);

}
