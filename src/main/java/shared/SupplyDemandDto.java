package shared;

import java.io.Serializable;

import shared.interfaceDto.MarkerDto;

public class SupplyDemandDto implements Serializable,MarkerDto{

	/**
	 * For checking version
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;

	private String type;

	private String category;

	private String title;
	
	private MemberDto member;	


	/* getter and setter */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public MemberDto getMember() {
		return member;
	}

	public void setMember(MemberDto member) {
		this.member = member;
	}	
}
