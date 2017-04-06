package shared;

import java.io.Serializable;
import java.util.List;

import shared.interfaceDto.MarkerDto;



public class MailDto implements Serializable,MarkerDto{

	/**
	 * For checking version
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;

	private String subject;

	private String messageBody;

	private MemberDto transmitterMember;
	
	private List<MemberDto> recipientMember;


	/* getter and setter */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public MemberDto getTransmitterMember() {
		return transmitterMember;
	}

	public void setTransmitterMember(MemberDto transmitterMember) {
		this.transmitterMember = transmitterMember;
	}

	public List<MemberDto> getRecipientMember() {
		return recipientMember;
	}

	public void setRecipientMember(List<MemberDto> recipientMember) {
		this.recipientMember = recipientMember;
	}
	
	

}