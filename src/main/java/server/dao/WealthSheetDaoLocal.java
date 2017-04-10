package server.dao;

import java.util.List;

import javax.ejb.Local;

import server.dao.entity.PaymentEntity;
import server.dao.entity.WealthSheetEntity;
import server.dao.interfaces.InterfaceDao;

@Local
public interface WealthSheetDaoLocal extends InterfaceDao<WealthSheetEntity>{
	
	//public void createWealthSheet(WealthSheetDto wealthSheetDto);
	
	public List<WealthSheetEntity> getAllWealthSheet();
	
	//public WealthSheetDto getWealthSheet(WealthSheetDto wealthSheetDto);
	
	public PaymentEntity addPayment(PaymentEntity paymentEntity);
	
	//public void updateWealthSheet(WealthSheetDto wealthSheetDto);
	
	//public void deleteWealthSheet(WealthSheetDto wealthSheetDto);
	
	

}
