package server.service;

import java.util.List;

import server.notification.MessageForNotification;
import shared.MemberDto;
import shared.NotificationDto;
import shared.criteria.MemberCriteria;

public interface ManageMember extends ServiceWithNotification{
	
	public List<MemberDto> getLastMembers(int amountMember);
	
	public MessageForNotification addMember(MemberDto memberDto);
	
	public List<MemberDto> searchMembers(MemberCriteria memberCriteria);
	
	public MemberDto getMemberById(int id);
	
	public MessageForNotification deleteMember(MemberDto memberDto);
	
	public void updateMember(MemberDto memberDto);
	
	public NotificationDto notifyMembers(MessageForNotification message);

}
