package shared;

import java.io.Serializable;

import shared.interfaceDto.MarkerDto;


public class NotificationDto implements Serializable,MarkerDto{
	
	/**
	 * For checking version
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private NotificationSubjectDto subject;

	private String text;
	
	private boolean state;
	

	/* getter and setter */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public NotificationSubjectDto getSubject() {
		return subject;
	}

	public void setSubject(NotificationSubjectDto subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

}
