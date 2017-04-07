package shared.dto;

import java.io.Serializable;

import shared.interfaceDto.MarkerDto;

public class MessageSubjectDto implements Serializable,MarkerDto{
	
	/**
	 * For checking version
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private MemberDto transmitterMember;	
	
	private MessageDto message;

	private String type;

	private String title;


	/* getter and setter */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MemberDto getTransmitterMember() {
		return transmitterMember;
	}

	public void setTransmitterMember(MemberDto transmitterMember) {
		this.transmitterMember = transmitterMember;
	}

	public MessageDto getMessage() {
		return message;
	}

	public void setMessage(MessageDto notification) {
		this.message = notification;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
