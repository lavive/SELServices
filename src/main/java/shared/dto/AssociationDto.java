//package shared.dto;
//
//import java.io.Serializable;
//
//import shared.interfaceDto.MarkerDao;
//import shared.interfaceDto.PersonDto;
//
//
//public class AssociationDto implements PersonDto,Serializable,MarkerDao {
//
//	/**
//	 * For checking version
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	
//	private Integer id;
//
//	private String name;
//	
//	private String town;
//
//	private String address;
//
//	private String email;
//
//	private String cellNumber;
//
//	private String phoneNumber;
//	
//	private String website;
//
//	
//
//	/* getter and setter */
//
//	@Override
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	@Override
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public String getTown() {
//		return town;
//	}
//
//	public void setTown(String town) {
//		this.town = town;
//	}
//
//	@Override
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	@Override
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	@Override
//	public String getCellNumber() {
//		return cellNumber;
//	}
//
//	public void setCellNumber(String cellNumber) {
//		this.cellNumber = cellNumber;
//	}
//
//	@Override
//	public String getPhoneNumber() {
//		return phoneNumber;
//	}
//
//	public void setPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//
//	public String getWebsite() {
//		return website;
//	}
//
//	public void setWebsite(String website) {
//		this.website = website;
//	}
//
//}
