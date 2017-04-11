//package shared.dto;
//
//import java.io.Serializable;
//import java.util.List;
//
//import shared.interfaceDto.MarkerDao;
//import shared.interfaceDto.PersonDto;
//
//public class MemberDto implements PersonDto,Serializable,MarkerDao{
//	
//	/**
//	 * For checking version
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	private Integer id;
//
//	private String name;
//
//	private String forname;
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
//	private List<SupplyDemandDto> supplyDemand;
//	
//	private WealthSheetDto wealthSheet;
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
//	public String getForname() {
//		return forname;
//	}
//
//	public void setForname(String forname) {
//		this.forname = forname;
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
//	public List<SupplyDemandDto> getSupplyDemand() {
//		return supplyDemand;
//	}
//
//	public void setSupplyDemand(List<SupplyDemandDto> supplyDemand) {
//		this.supplyDemand = supplyDemand;
//	}
//
//	public WealthSheetDto getWealthSheet() {
//		return wealthSheet;
//	}
//
//	public void setWealthSheet(WealthSheetDto wealthSheet) {
//		this.wealthSheet = wealthSheet;
//	}
//
//
//}
