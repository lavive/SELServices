package server.dao;

import java.util.List;

import server.dao.interfaceDao.InterfaceDao;
import shared.dto.PaymentDto;
import shared.dto.WealthSheetDto;

public interface WealthSheetDao extends InterfaceDao<WealthSheetDto>{
	
	//public void createWealthSheet(WealthSheetDto wealthSheetDto);
	
	public List<WealthSheetDto> getAllWealthSheet();
	
	//public WealthSheetDto getWealthSheet(WealthSheetDto wealthSheetDto);
	
	public PaymentDto addPayment(PaymentDto paymentDto);
	
	//public void updateWealthSheet(WealthSheetDto wealthSheetDto);
	
	//public void deleteWealthSheet(WealthSheetDto wealthSheetDto);
	
	

}
