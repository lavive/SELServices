package server.dao.transform;

import java.util.ArrayList;

import server.dao.entity.AssociationEntity;
import server.dao.entity.CatalogEntity;
import server.dao.entity.CategoryEntity;
import server.dao.entity.GeneralOfferEntity;
import server.dao.entity.MailEntity;
import server.dao.entity.MemberEntity;
import server.dao.entity.NotificationEntity;
import server.dao.entity.NotificationSubjectEntity;
import server.dao.entity.PaymentEntity;
import server.dao.entity.SmsEntity;
import server.dao.entity.SupplyDemandEntity;
import server.dao.entity.WealthSheetEntity;
import shared.AssociationDto;
import shared.CatalogDto;
import shared.CategoryDto;
import shared.GeneralOfferDto;
import shared.MailDto;
import shared.MemberDto;
import shared.NotificationDto;
import shared.NotificationSubjectDto;
import shared.PaymentDto;
import shared.SmsDto;
import shared.SupplyDemandDto;
import shared.WealthSheetDto;

public class EntityToDto {
	
	public static AssociationDto AssociationDtoToEntity(AssociationEntity associationEntity){
		AssociationDto associationDto = new AssociationDto();
		
		associationDto.setId(associationEntity.getId());
		associationDto.setName(associationEntity.getName());
		associationDto.setTown(associationEntity.getTown());
		associationDto.setAddress(associationEntity.getAddress());
		associationDto.setEmail(associationEntity.getEmail());
		associationDto.setCellNumber(associationEntity.getCellNumber());
		associationDto.setPhoneNumber(associationEntity.getPhoneNumber());
		associationDto.setWebsite(associationEntity.getPhoneNumber());
		
		return associationDto;
	}
	
	public static CatalogDto CatalogEntityToDto(CatalogEntity catalogEntity){
		CatalogDto catalogDto = new CatalogDto();
		
		catalogDto.setId(catalogEntity.getId());
		catalogDto.setModificationDate(catalogEntity.getModificationDate());
		
		ArrayList<GeneralOfferDto> offersDto = new ArrayList<GeneralOfferDto>();
		for(GeneralOfferEntity offerEntity:catalogEntity.getOffers()){
			offersDto.add(GeneralOfferEntityToDto(offerEntity));
		}
		catalogDto.setOffers(offersDto);
		
		return catalogDto;
	}
	
	public static CategoryDto  CategoryDtoToEntity(CategoryEntity categoryEntity){
		CategoryDto categoryDto = new CategoryDto();
		
		categoryDto.setId(categoryEntity.getId());
		categoryDto.setName(categoryEntity.getName());
		
		return categoryDto;
	}
	
	public static GeneralOfferDto GeneralOfferEntityToDto(GeneralOfferEntity generalOfferEntity){
		GeneralOfferDto generalOfferDto = new GeneralOfferDto();
		
		generalOfferDto.setId(generalOfferEntity.getId());
		generalOfferDto.setCategory(generalOfferEntity.getCategory());
		generalOfferDto.setTitle(generalOfferEntity.getTitle());
		
		return generalOfferDto;
	}
	
	public static MailDto MailEntityToDtoy(MailEntity mailEntity){
		MailDto mailDto = new MailDto();
		
		mailDto.setId(mailEntity.getId());
		mailDto.setSubject(mailEntity.getSubject());
		mailDto.setMessageBody(mailEntity.getMessageBody());
		
		mailDto.setTransmitterMember(MemberEntityToDto(mailEntity.getTransmitterMember()));
		
		ArrayList<MemberDto> membersDto = new ArrayList<MemberDto>();
		for(MemberEntity memberEntity:mailEntity.getRecipientMember()){
			membersDto.add(MemberEntityToDto(memberEntity));
		}
		mailDto.setRecipientMember(membersDto);
		
		return mailDto;
	}
	
	public static MemberDto MemberEntityToDto(MemberEntity memberEntity){
		MemberDto memberDto = new MemberDto();
		
		memberDto.setId(memberEntity.getId());
		memberDto.setAddress(memberEntity.getAddress());
		memberDto.setCellNumber(memberEntity.getCellNumber());
		memberDto.setEmail(memberEntity.getEmail());
		memberDto.setForname(memberEntity.getForname());
		memberDto.setName(memberEntity.getName());
		memberDto.setPhoneNumber(memberEntity.getPhoneNumber());
		memberDto.setTown(memberEntity.getTown());
		
		memberDto.setWealthSheet(WealthSheetEntityToDto(memberEntity.getWealthSheet()));
		
		ArrayList<SupplyDemandDto> supplyDemandsDto = new ArrayList<SupplyDemandDto>();
		for(SupplyDemandEntity supplyDemandEntity:memberEntity.getSupplyDemand()){
			supplyDemandsDto.add(SupplyDemandEntityToDto(supplyDemandEntity));
		}
		memberDto.setSupplyDemand(supplyDemandsDto);
		
		
		return memberDto;
	}
	
	public static NotificationDto NotificationEntityToDto(NotificationEntity notificationEntity){
		NotificationDto notificationDto = new NotificationDto();
		
		notificationDto.setId(notificationEntity.getId());
		notificationDto.setText(notificationEntity.getText());
		notificationDto.setState(notificationEntity.isState());
		notificationDto.setSubject(NotificationSubjectEntityToDto(notificationEntity.getSubject()));
		
		return notificationDto;
	}
	
	public static NotificationSubjectDto NotificationSubjectEntityToDto(NotificationSubjectEntity notificationSubjectEntity){
		NotificationSubjectDto notificationSubjectDto = new NotificationSubjectDto();
		
		notificationSubjectDto.setId(notificationSubjectEntity.getId());
		notificationSubjectDto.setType(notificationSubjectEntity.getType());
		notificationSubjectDto.setTitle(notificationSubjectEntity.getTitle());		
		notificationSubjectDto.setNotification(NotificationEntityToDto(notificationSubjectEntity.getNotification()));
		notificationSubjectDto.setTransmitterMember(MemberEntityToDto(notificationSubjectEntity.getTransmitterMember()));
		
		return notificationSubjectDto;
	}
	
	public static PaymentDto PaymentEntityToDto(PaymentEntity PaymentEntity){
		PaymentDto paymentDto = new PaymentDto();
		
		paymentDto.setId(PaymentEntity.getId());
		paymentDto.setAmount(PaymentEntity.getAmount());
		paymentDto.setCreditorMember(MemberEntityToDto(PaymentEntity.getCreditorMember()));
		paymentDto.setDebtorMember(MemberEntityToDto(PaymentEntity.getDebtorMember()));
		paymentDto.setSupplyDemand(SupplyDemandEntityToDto(PaymentEntity.getSupplyDemand()));
		
		return paymentDto;
	}
	
	public static SmsDto SMSEntityToDto(SmsEntity smsEntity){
		SmsDto smsDto = new SmsDto();
		
		smsDto.setId(smsEntity.getId());
		smsDto.setMessageBody(smsEntity.getMessageBody());
		
		smsDto.setTransmitterMember(MemberEntityToDto(smsEntity.getTransmitterMember()));
		
		ArrayList<MemberDto> membersDto = new ArrayList<MemberDto>();
		for(MemberEntity memberEntity:smsEntity.getRecipientMember()){
			membersDto.add(MemberEntityToDto(memberEntity));
		}
		smsDto.setRecipientMember(membersDto);
		
		return smsDto;
	}
	
	public static SupplyDemandDto SupplyDemandEntityToDto(SupplyDemandEntity SupplyDemandEntity){
		SupplyDemandDto supplyDemandDto = new SupplyDemandDto();
		
		supplyDemandDto.setId(SupplyDemandEntity.getId());
		supplyDemandDto.setCategory(SupplyDemandEntity.getCategory());
		supplyDemandDto.setTitle(SupplyDemandEntity.getTitle());
		supplyDemandDto.setType(SupplyDemandEntity.getType());
		supplyDemandDto.setMember(MemberEntityToDto(SupplyDemandEntity.getMember()));
		
		return supplyDemandDto;
	}
	
	public static WealthSheetDto WealthSheetEntityToDto(WealthSheetEntity WealthSheetEntity){
		WealthSheetDto wealthSheetDto = new WealthSheetDto();
		
		wealthSheetDto.setId(WealthSheetEntity.getId());
		wealthSheetDto.setInitialAccount(WealthSheetEntity.getInitialAccount());
		wealthSheetDto.setFinalAccount(WealthSheetEntity.getFinalAccount());
		wealthSheetDto.setMember(MemberEntityToDto(WealthSheetEntity.getMember()));
		
		ArrayList<PaymentDto> paymentsDto = new ArrayList<PaymentDto>();
		for(PaymentEntity paymentEntity:WealthSheetEntity.getPayment()){
			paymentsDto.add(PaymentEntityToDto(paymentEntity));
		}
		wealthSheetDto.setPayment(paymentsDto);
		
		return wealthSheetDto;
	}

}
