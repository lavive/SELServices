package server.service;

import java.util.List;

import javax.ejb.Local;

import server.notification.MessageForNotification;
import shared.dto.MemberDto;
import shared.dto.MessageDto;
import shared.dto.SupplyDemandDto;

@Local
public interface ManageSupplyDemandLocal extends ServiceWithNotification{

	public MessageForNotification addSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	public List<SupplyDemandDto> displaySupplyDemand();
	
	public List<SupplyDemandDto> displaySupplyDemand(MemberDto memberDto);
	
	public SupplyDemandDto getSupplyDemandById(int id);
	
	public void deleteSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	public MessageForNotification updateSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	public MessageDto notifyMembers(MessageForNotification message);

}
