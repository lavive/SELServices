//package server.dao.transform;
//
//import java.util.ArrayList;
//
//import server.dao.entity.AssociationEntity;
//import server.dao.entity.CatalogEntity;
//import server.dao.entity.CategoryEntity;
//import server.dao.entity.GeneralOfferEntity;
//import server.dao.entity.MailEntity;
//import server.dao.entity.MemberEntity;
//import server.dao.entity.MessageEntity;
//import server.dao.entity.MessageSubjectEntity;
//import server.dao.entity.PaymentEntity;
//import server.dao.entity.SmsEntity;
//import server.dao.entity.SupplyDemandEntity;
//import server.dao.entity.WealthSheetEntity;
//import shared.dto.AssociationDto;
//import shared.dto.CatalogDto;
//import shared.dto.CategoryDto;
//import shared.dto.GeneralOfferDto;
//import shared.dto.MailDto;
//import shared.dto.MemberDto;
//import shared.dto.MessageDto;
//import shared.dto.MessageSubjectDto;
//import shared.dto.PaymentDto;
//import shared.dto.SmsDto;
//import shared.dto.SupplyDemandDto;
//import shared.dto.WealthSheetDto;
//
//public class DtoToEntity {
//	
//	public static AssociationEntity associationDtoToEntity(AssociationDto associationDto){
//		AssociationEntity associationEntity = new AssociationEntity();
//		
//		associationEntity.setId(associationDto.getId());
//		associationEntity.setName(associationDto.getName());
//		associationEntity.setTown(associationDto.getTown());
//		associationEntity.setAddress(associationDto.getAddress());
//		associationEntity.setEmail(associationDto.getEmail());
//		associationEntity.setCellNumber(associationDto.getCellNumber());
//		associationEntity.setPhoneNumber(associationDto.getPhoneNumber());
//		associationEntity.setWebsite(associationDto.getPhoneNumber());
//		
//		return associationEntity;
//	}
//	
//	public static CatalogEntity catalogDtoToEntity(CatalogDto catalogDto){
//		CatalogEntity catalogEntity = new CatalogEntity();
//		
//		catalogEntity.setId(catalogDto.getId());
//		catalogEntity.setModificationDate(catalogDto.getModificationDate());
//		
//		ArrayList<GeneralOfferEntity> offersEntity = new ArrayList<GeneralOfferEntity>();
//		for(GeneralOfferDto offerDto:catalogDto.getOffers()){
//			offersEntity.add(generalOfferDtoToEntity(offerDto));
//		}
//		catalogEntity.setOffers(offersEntity);
//		
//		return catalogEntity;
//	}
//	
//	public static CategoryEntity categoryDtoToEntity(CategoryDto categoryDto){
//		CategoryEntity categoryEntity = new CategoryEntity();
//		
//		categoryEntity.setId(categoryDto.getId());
//		categoryEntity.setName(categoryDto.getName());
//		
//		return categoryEntity;
//	}
//	
//	public static GeneralOfferEntity generalOfferDtoToEntity(GeneralOfferDto generalOfferDto){
//		GeneralOfferEntity generalOfferEntity = new GeneralOfferEntity();
//		
//		generalOfferEntity.setId(generalOfferDto.getId());
//		generalOfferEntity.setCategory(generalOfferDto.getCategory());
//		generalOfferEntity.setTitle(generalOfferDto.getTitle());
//		
//		return generalOfferEntity;
//	}
//	
//	public static MailEntity mailDtoToEntity(MailDto mailDto){
//		MailEntity mailEntity = new MailEntity();
//		
//		mailEntity.setId(mailDto.getId());
//		mailEntity.setSubject(mailDto.getSubject());
//		mailEntity.setMessageBody(mailDto.getMessageBody());
//		
//		mailEntity.setTransmitterMember(memberDtoToEntity(mailDto.getTransmitterMember()));
//		
//		ArrayList<MemberEntity> membersEntity = new ArrayList<MemberEntity>();
//		for(MemberDto memberDto:mailDto.getRecipientMember()){
//			membersEntity.add(memberDtoToEntity(memberDto));
//		}
//		mailEntity.setRecipientMember(membersEntity);
//		
//		return mailEntity;
//	}
//	
//	public static MemberEntity memberDtoToEntity(MemberDto memberDto){
//		MemberEntity memberEntity = new MemberEntity();
//		
//		memberEntity.setId(memberDto.getId());
//		memberEntity.setAddress(memberDto.getAddress());
//		memberEntity.setCellNumber(memberDto.getCellNumber());
//		memberEntity.setEmail(memberDto.getEmail());
//		memberEntity.setForname(memberDto.getForname());
//		memberEntity.setName(memberDto.getName());
//		memberEntity.setPhoneNumber(memberDto.getPhoneNumber());
//		memberEntity.setTown(memberDto.getTown());
//		
//		memberEntity.setWealthSheet(wealthSheetDtoToEntity(memberDto.getWealthSheet()));
//		
//		ArrayList<SupplyDemandEntity> supplyDemandsEntity = new ArrayList<SupplyDemandEntity>();
//		for(SupplyDemandDto supplyDemandDto:memberDto.getSupplyDemand()){
//			supplyDemandsEntity.add(supplyDemandDtoToEntity(supplyDemandDto));
//		}
//		memberEntity.setSupplyDemand(supplyDemandsEntity);
//		
//		
//		return memberEntity;
//	}
//	
//	public static MessageEntity messageDtoToEntity(MessageDto messageDto){
//		MessageEntity messageEntity = new MessageEntity();
//		
//		messageEntity.setId(messageDto.getId());
//		messageEntity.setText(messageDto.getText());
//		messageEntity.setState(messageDto.isState());
//		messageEntity.setSubject(messageSubjectDtoToEntity(messageDto.getSubject()));
//		
//		return messageEntity;
//	}
//	
//	public static MessageSubjectEntity messageSubjectDtoToEntity(MessageSubjectDto messageSubjectDto){
//		MessageSubjectEntity messageSubjectEntity = new MessageSubjectEntity();
//		
//		messageSubjectEntity.setId(messageSubjectDto.getId());
//		messageSubjectEntity.setType(messageSubjectDto.getType());
//		messageSubjectEntity.setTitle(messageSubjectDto.getTitle());		
//		messageSubjectEntity.setMessage(messageDtoToEntity(messageSubjectDto.getMessage()));
//		messageSubjectEntity.setTransmitterMember(memberDtoToEntity(messageSubjectDto.getTransmitterMember()));
//		
//		return messageSubjectEntity;
//	}
//	
//	public static PaymentEntity paymentDtoToEntity(PaymentDto paymentDto){
//		PaymentEntity paymentEntity = new PaymentEntity();
//		
//		paymentEntity.setId(paymentDto.getId());
//		paymentEntity.setAmount(paymentDto.getAmount());
//		paymentEntity.setCreditorMember(memberDtoToEntity(paymentDto.getCreditorMember()));
//		paymentEntity.setDebtorMember(memberDtoToEntity(paymentDto.getDebtorMember()));
//		paymentEntity.setSupplyDemand(supplyDemandDtoToEntity(paymentDto.getSupplyDemand()));
//		
//		return paymentEntity;
//	}
//	
//	public static SmsEntity smsDtoToEntity(SmsDto smsDto){
//		SmsEntity smsEntity = new SmsEntity();
//		
//		smsEntity.setId(smsDto.getId());
//		smsEntity.setMessageBody(smsDto.getMessageBody());		
//		smsEntity.setTransmitterMember(memberDtoToEntity(smsDto.getTransmitterMember()));
//		
//		ArrayList<MemberEntity> membersEntity = new ArrayList<MemberEntity>();
//		for(MemberDto memberDto:smsDto.getRecipientMember()){
//			membersEntity.add(memberDtoToEntity(memberDto));
//		}
//		smsEntity.setRecipientMember(membersEntity);
//		
//		return smsEntity;
//	}
//	
//	public static SupplyDemandEntity supplyDemandDtoToEntity(SupplyDemandDto SupplyDemandDto){
//		SupplyDemandEntity supplyDemandEntity = new SupplyDemandEntity();
//		
//		supplyDemandEntity.setId(SupplyDemandDto.getId());
//		supplyDemandEntity.setCategory(SupplyDemandDto.getCategory());
//		supplyDemandEntity.setTitle(SupplyDemandDto.getTitle());
//		supplyDemandEntity.setType(SupplyDemandDto.getType());
//		supplyDemandEntity.setMember(memberDtoToEntity(SupplyDemandDto.getMember()));
//		
//		return supplyDemandEntity;
//	}
//	
//	public static WealthSheetEntity wealthSheetDtoToEntity(WealthSheetDto WealthSheetDto){
//		WealthSheetEntity wealthSheetEntity = new WealthSheetEntity();
//		
//		wealthSheetEntity.setId(WealthSheetDto.getId());
//		wealthSheetEntity.setInitialAccount(WealthSheetDto.getInitialAccount());
//		wealthSheetEntity.setFinalAccount(WealthSheetDto.getFinalAccount());
//		wealthSheetEntity.setMember(memberDtoToEntity(WealthSheetDto.getMember()));
//		
//		ArrayList<PaymentEntity> paymentsEntity = new ArrayList<PaymentEntity>();
//		for(PaymentDto paymentDto:WealthSheetDto.getPayment()){
//			paymentsEntity.add(paymentDtoToEntity(paymentDto));
//		}
//		wealthSheetEntity.setPayment(paymentsEntity);
//		
//		return wealthSheetEntity;
//	}
//
//}
