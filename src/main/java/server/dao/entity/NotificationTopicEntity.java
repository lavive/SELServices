package server.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "notification_topic")
public class NotificationTopicEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "event")
	private String event;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn (name="id_person")
	private PersonEntity personOriginEvent;
	
	@Column(name = "category")
	private String category;

	/* getter and setter */
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public PersonEntity getPersonOriginEvent() {
		return personOriginEvent;
	}

	public void setPersonOriginEvent(PersonEntity personOriginEvent) {
		this.personOriginEvent = personOriginEvent;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
