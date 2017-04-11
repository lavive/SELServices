//package shared.dto;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.List;
//
//import shared.interfaceDto.MarkerDao;
//
//
//public class WealthSheetDto implements Serializable,MarkerDao{
//
//	/**
//	 * For checking version
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	private Integer id;
//	
//	private MemberDto member;
//
//	private BigDecimal initialAccount;
//
//	private BigDecimal finalAccount;
//
//	private List<PaymentDto> payment;
//	
//	
//	/* getter and setter */
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public MemberDto getMember() {
//		return member;
//	}
//
//	public void setMember(MemberDto member) {
//		this.member = member;
//	}
//
//	public BigDecimal getInitialAccount() {
//		return initialAccount;
//	}
//
//	public void setInitialAccount(BigDecimal initialAccount) {
//		this.initialAccount = initialAccount;
//	}
//
//	public BigDecimal getFinalAccount() {
//		return finalAccount;
//	}
//
//	public void setFinalAccount(BigDecimal finalAccount) {
//		this.finalAccount = finalAccount;
//	}
//
//	public List<PaymentDto> getPayment() {
//		return payment;
//	}
//
//	public void setPayment(List<PaymentDto> payment) {
//		this.payment = payment;
//	}
//}
