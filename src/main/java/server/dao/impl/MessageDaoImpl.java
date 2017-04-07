package server.dao.impl;

import java.util.List;

import server.dao.MessageDao;
import shared.dto.MailDto;
import shared.dto.MemberDto;
import shared.dto.MessageDto;
import shared.dto.SmsDto;

public class MessageDaoImpl implements MessageDao {

	@Override
	public void create(MessageDto dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public MessageDto get(MessageDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(MessageDto dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(MessageDto dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MessageDto> getMessageByState(boolean state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createSMS(MessageDto notificationDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public SmsDto getSMS(MessageDto notificationDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSMS(MessageDto notificationDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createMail(MessageDto notificationDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public MailDto getMail(MessageDto notificationDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMail(MessageDto notificationDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MessageDto> getMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MessageDto> getMessages(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageDto getMessageById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMessages(List<MessageDto> messageDtos) {
		// TODO Auto-generated method stub
		
	}

}
