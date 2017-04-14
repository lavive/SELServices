package server.service;

import javax.ejb.Remote;

import shared.dto.MessageDto;


@Remote
public interface ManageMessageRemote{
	
	public void sendMessage(MessageDto messageDto);

}
