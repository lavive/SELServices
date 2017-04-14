package server.service.bean;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import server.dao.MessageDaoLocal;
import server.service.ManageMessageRemote;
import server.service.transform.DtoToEntity;
import shared.dto.MessageDto;

@Stateless
public class ManageMessageBean implements ManageMessageRemote {
	
	@EJB
	private MessageDaoLocal messageDao;

	

	@Override
	public void sendMessage(MessageDto messageDto) {
		
		messageDao.create(DtoToEntity.messageDtoToEntity(messageDto));
		
	}

}
