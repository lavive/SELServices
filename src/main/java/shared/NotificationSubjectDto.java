package shared;

import java.io.Serializable;

import shared.interfaceDto.MarkerDto;

public class NotificationSubjectDto implements Serializable,MarkerDto{
	
	/**
	 * For checking version
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private MemberDto transmitterMember;	
	
	private NotificationDto notification;

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

	public NotificationDto getNotification() {
		return notification;
	}

	public void setNotification(NotificationDto notification) {
		this.notification = notification;
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
