package server.service;

import java.util.List;

import javax.ejb.Local;

import server.notification.MessageForNotification;
import server.service.exception.MemberCriteriaNullException;
import shared.criteria.MemberCriteria;
import shared.dto.MemberDto;
import shared.dto.MessageDto;

@Local
public interface ManageMemberLocal extends ServiceWithNotification{
	
	public List<MemberDto> getLastMembers(int amountMember);
	
	public MessageForNotification addMember(MemberDto memberDto);
	
	public List<MemberDto> searchMembers(MemberCriteria memberCriteria) throws MemberCriteriaNullException;
	
	public MemberDto getMemberById(int id);
	
	public MessageForNotification deleteMember(MemberDto memberDto);
	
	public void updateMember(MemberDto memberDto);
	
	public MessageDto notifyMembers(MessageForNotification message);

}
