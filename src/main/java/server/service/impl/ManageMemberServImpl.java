package server.service.impl;

import java.util.List;

import server.dao.MemberDao;
import server.notification.MessageForNotification;
import server.notification.NotificationFactory;
import server.service.ManageMemberServ;
import server.service.exception.MemberCriteriaNullException;
import shared.criteria.MemberCriteria;
import shared.dto.MemberDto;
import shared.dto.MessageDto;

public class ManageMemberServImpl implements ManageMemberServ {
	
	private MemberDao memberDao;

	@Override
	public NotificationFactory getNotificationFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDto> getLastMembers(int amountMember) {
		
		return memberDao.getListLastMember(amountMember);
	}

	@Override
	public MessageForNotification addMember(MemberDto memberDto) {
		memberDao.create(memberDto);
		return null;
	}

	@Override
	public List<MemberDto> searchMembers(MemberCriteria memberCriteria) throws MemberCriteriaNullException{
		if(memberCriteria.isEmpty())
			throw new MemberCriteriaNullException("Un des critères de recherche d'un membre au moins ne doit pas être null!");
		if(memberCriteria.getName() != null && memberCriteria.getForname() != null)
			return memberDao.getMembersByNameAndForname(memberCriteria.getName(),memberCriteria.getForname());
		else if(memberCriteria.getName() != null)
			return memberDao.getMembersByName(memberCriteria.getName());
		else if(memberCriteria.getType() != null && memberCriteria.getCategory() != null)
			return memberDao.getMembersBySupplyDemand(memberCriteria.getType(), memberCriteria.getCategory());
		else if(memberCriteria.getTown() != null)
			return memberDao.getMembersByTown(memberCriteria.getTown());
		else
			throw new MemberCriteriaNullException("les critères sélectionnés ne permettent pas de récupérer des membres!");
				
	}

	@Override
	public MemberDto getMemberById(int id) {
		
		return memberDao.getMemberById(id);
	}

	@Override
	public MessageForNotification deleteMember(MemberDto memberDto) {
		memberDao.delete(memberDto);
		return null;
	}

	@Override
	public void updateMember(MemberDto memberDto) {
		
		memberDao.update(memberDto);

	}

	@Override
	public MessageDto notifyMembers(MessageForNotification message) {
		// TODO Auto-generated method stub
		return null;
	}

}