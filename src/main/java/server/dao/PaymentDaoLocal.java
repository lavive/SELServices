package server.dao;


import javax.ejb.Local;

import server.dao.entity.PaymentEntity;
import server.dao.interfaces.InterfaceDao;

@Local
public interface PaymentDaoLocal extends InterfaceDao<PaymentEntity>{
	
//	public void createPayment(PaymentDto paymentDto);
//	
//	public PaymentDto getPayment(PaymentDto paymentDto);
//	
//	public void updatePayment(PaymentDto paymentDto);
//	
//	public void deletePayment(PaymentDto paymentDto);

	
}
