package server.dao.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mail")
public class MailEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "subject", nullable = false)
	private String subject;

	@Column(name = "message_body")
	private String messageBody;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private MemberEntity transmitterMember;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<MemberEntity> recipientMember;


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

	public MemberEntity getTransmitterMember() {
		return transmitterMember;
	}

	public void setTransmitterMember(MemberEntity transmitterMember) {
		this.transmitterMember = transmitterMember;
	}

	public List<MemberEntity> getRecipientMember() {
		return recipientMember;
	}

	public void setRecipientMember(List<MemberEntity> recipientMember) {
		this.recipientMember = recipientMember;
	}
}
