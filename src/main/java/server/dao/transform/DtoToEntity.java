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

public class DtoToEntity {
	
	public static AssociationEntity AssociationDtoToEntity(AssociationDto associationDto){
		AssociationEntity associationEntity = new AssociationEntity();
		
		associationEntity.setId(associationDto.getId());
		associationEntity.setName(associationDto.getName());
		associationEntity.setTown(associationDto.getTown());
		associationEntity.setAddress(associationDto.getAddress());
		associationEntity.setEmail(associationDto.getEmail());
		associationEntity.setCellNumber(associationDto.getCellNumber());
		associationEntity.setPhoneNumber(associationDto.getPhoneNumber());
		associationEntity.setWebsite(associationDto.getPhoneNumber());
		
		return associationEntity;
	}
	
	public static CatalogEntity CatalogDtoToEntity(CatalogDto catalogDto){
		CatalogEntity catalogEntity = new CatalogEntity();
		
		catalogEntity.setId(catalogDto.getId());
		catalogEntity.setModificationDate(catalogDto.getModificationDate());
		
		ArrayList<GeneralOfferEntity> offersEntity = new ArrayList<GeneralOfferEntity>();
		for(GeneralOfferDto offerDto:catalogDto.getOffers()){
			offersEntity.add(GeneralOfferDtoToEntity(offerDto));
		}
		catalogEntity.setOffers(offersEntity);
		
		return catalogEntity;
	}
	
	public static CategoryEntity CategoryDtoToEntity(CategoryDto categoryDto){
		CategoryEntity categoryEntity = new CategoryEntity();
		
		categoryEntity.setId(categoryDto.getId());
		categoryEntity.setName(categoryDto.getName());
		
		return categoryEntity;
	}
	
	public static GeneralOfferEntity GeneralOfferDtoToEntity(GeneralOfferDto generalOfferDto){
		GeneralOfferEntity generalOfferEntity = new GeneralOfferEntity();
		
		generalOfferEntity.setId(generalOfferDto.getId());
		generalOfferEntity.setCategory(generalOfferDto.getCategory());
		generalOfferEntity.setTitle(generalOfferDto.getTitle());
		
		return generalOfferEntity;
	}
	
	public static MailEntity MailDtoToEntity(MailDto mailDto){
		MailEntity mailEntity = new MailEntity();
		
		mailEntity.setId(mailDto.getId());
		mailEntity.setSubject(mailDto.getSubject());
		mailEntity.setMessageBody(mailDto.getMessageBody());
		
		mailEntity.setTransmitterMember(MemberDtoToEntity(mailDto.getTransmitterMember()));
		
		ArrayList<MemberEntity> membersEntity = new ArrayList<MemberEntity>();
		for(MemberDto memberDto:mailDto.getRecipientMember()){
			membersEntity.add(MemberDtoToEntity(memberDto));
		}
		mailEntity.setRecipientMember(membersEntity);
		
		return mailEntity;
	}
	
	public static MemberEntity MemberDtoToEntity(MemberDto memberDto){
		MemberEntity memberEntity = new MemberEntity();
		
		memberEntity.setId(memberDto.getId());
		memberEntity.setAddress(memberDto.getAddress());
		memberEntity.setCellNumber(memberDto.getCellNumber());
		memberEntity.setEmail(memberDto.getEmail());
		memberEntity.setForname(memberDto.getForname());
		memberEntity.setName(memberDto.getName());
		memberEntity.setPhoneNumber(memberDto.getPhoneNumber());
		memberEntity.setTown(memberDto.getTown());
		
		memberEntity.setWealthSheet(WealthSheetDtoToEntity(memberDto.getWealthSheet()));
		
		ArrayList<SupplyDemandEntity> supplyDemandsEntity = new ArrayList<SupplyDemandEntity>();
		for(SupplyDemandDto supplyDemandDto:memberDto.getSupplyDemand()){
			supplyDemandsEntity.add(SupplyDemandDtoToEntity(supplyDemandDto));
		}
		memberEntity.setSupplyDemand(supplyDemandsEntity);
		
		
		return memberEntity;
	}
	
	public static NotificationEntity NotificationDtoToEntity(NotificationDto notificationDto){
		NotificationEntity notificationEntity = new NotificationEntity();
		
		notificationEntity.setId(notificationDto.getId());
		notificationEntity.setText(notificationDto.getText());
		notificationEntity.setState(notificationDto.isState());
		notificationEntity.setSubject(NotificationSubjectDtoToEntity(notificationDto.getSubject()));
		
		return notificationEntity;
	}
	
	public static NotificationSubjectEntity NotificationSubjectDtoToEntity(NotificationSubjectDto notificationSubjectDto){
		NotificationSubjectEntity notificationSubjectEntity = new NotificationSubjectEntity();
		
		notificationSubjectEntity.setId(notificationSubjectDto.getId());
		notificationSubjectEntity.setType(notificationSubjectDto.getType());
		notificationSubjectEntity.setTitle(notificationSubjectDto.getTitle());		
		notificationSubjectEntity.setNotification(NotificationDtoToEntity(notificationSubjectDto.getNotification()));
		notificationSubjectEntity.setTransmitterMember(MemberDtoToEntity(notificationSubjectDto.getTransmitterMember()));
		
		return notificationSubjectEntity;
	}
	
	public static PaymentEntity PaymentDtoToEntity(PaymentDto paymentDto){
		PaymentEntity paymentEntity = new PaymentEntity();
		
		paymentEntity.setId(paymentDto.getId());
		paymentEntity.setAmount(paymentDto.getAmount());
		paymentEntity.setCreditorMember(MemberDtoToEntity(paymentDto.getCreditorMember()));
		paymentEntity.setDebtorMember(MemberDtoToEntity(paymentDto.getDebtorMember()));
		paymentEntity.setSupplyDemand(SupplyDemandDtoToEntity(paymentDto.getSupplyDemand()));
		
		return paymentEntity;
	}
	
	public static SmsEntity SMSDtoToEntity(SmsDto smsDto){
		SmsEntity smsEntity = new SmsEntity();
		
		smsEntity.setId(smsDto.getId());
		smsEntity.setMessageBody(smsDto.getMessageBody());		
		smsEntity.setTransmitterMember(MemberDtoToEntity(smsDto.getTransmitterMember()));
		
		ArrayList<MemberEntity> membersEntity = new ArrayList<MemberEntity>();
		for(MemberDto memberDto:smsDto.getRecipientMember()){
			membersEntity.add(MemberDtoToEntity(memberDto));
		}
		smsEntity.setRecipientMember(membersEntity);
		
		return smsEntity;
	}
	
	public static SupplyDemandEntity SupplyDemandDtoToEntity(SupplyDemandDto SupplyDemandDto){
		SupplyDemandEntity supplyDemandEntity = new SupplyDemandEntity();
		
		supplyDemandEntity.setId(SupplyDemandDto.getId());
		supplyDemandEntity.setCategory(SupplyDemandDto.getCategory());
		supplyDemandEntity.setTitle(SupplyDemandDto.getTitle());
		supplyDemandEntity.setType(SupplyDemandDto.getType());
		supplyDemandEntity.setMember(MemberDtoToEntity(SupplyDemandDto.getMember()));
		
		return supplyDemandEntity;
	}
	
	public static WealthSheetEntity WealthSheetDtoToEntity(WealthSheetDto WealthSheetDto){
		WealthSheetEntity wealthSheetEntity = new WealthSheetEntity();
		
		wealthSheetEntity.setId(WealthSheetDto.getId());
		wealthSheetEntity.setInitialAccount(WealthSheetDto.getInitialAccount());
		wealthSheetEntity.setFinalAccount(WealthSheetDto.getFinalAccount());
		wealthSheetEntity.setMember(MemberDtoToEntity(WealthSheetDto.getMember()));
		
		ArrayList<PaymentEntity> paymentsEntity = new ArrayList<PaymentEntity>();
		for(PaymentDto paymentDto:WealthSheetDto.getPayment()){
			paymentsEntity.add(PaymentDtoToEntity(paymentDto));
		}
		wealthSheetEntity.setPayment(paymentsEntity);
		
		return wealthSheetEntity;
	}

}
