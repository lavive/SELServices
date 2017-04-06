package server.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "notification_subject")
public class NotificationSubjectEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private MemberEntity transmitterMember;	
	
	@OneToOne(fetch = FetchType.EAGER, mappedBy="subject")
	private NotificationEntity notification;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "title")
	private String title;


	/* getter and setter */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MemberEntity getTransmitterMember() {
		return transmitterMember;
	}

	public void setTransmitterMember(MemberEntity transmitterMember) {
		this.transmitterMember = transmitterMember;
	}

	public NotificationEntity getNotification() {
		return notification;
	}

	public void setNotification(NotificationEntity notification) {
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
