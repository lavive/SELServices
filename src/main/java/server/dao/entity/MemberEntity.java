package server.dao.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class MemberEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "forname")
	private String forname;
	
	@Column(name = "town")
	private String town;

	@Column(name = "address")
	private String address;

	@Column(name = "email")
	private String email;

	@Column(name = "cell_number")
	private String cellNumber;

	@Column(name = "phone_number")
	private String phoneNumber;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy= "member")
	private List<SupplyDemandEntity> supplyDemand;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "wealth_sheet_id")
	private WealthSheetEntity wealthSheet;

	

	/* getter and setter */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getForname() {
		return forname;
	}

	public void setForname(String forname) {
		this.forname = forname;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<SupplyDemandEntity> getSupplyDemand() {
		return supplyDemand;
	}

	public void setSupplyDemand(List<SupplyDemandEntity> supplyDemand) {
		this.supplyDemand = supplyDemand;
	}

	public WealthSheetEntity getWealthSheet() {
		return wealthSheet;
	}

	public void setWealthSheet(WealthSheetEntity wealthSheet) {
		this.wealthSheet = wealthSheet;
	}
		
}
