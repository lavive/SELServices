package server.notification.interceptor;

import javax.ejb.EJB;
import javax.ejb.TransactionAttribute;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import server.dao.NotificationDaoLocal;
import server.dao.interfaces.InterfaceDao;
import server.dao.interfaces.MarkerEntity;
import server.notification.factory.NotificationFactoryContextLocal;

@TransactionAttribute
public class InterceptorToNotify {
	
	@EJB 
	NotificationFactoryContextLocal notificationContext;
	
	@EJB
	NotificationDaoLocal notificationDao;
	
	@AroundInvoke
	public Object notify(InvocationContext ic) throws Exception {
		Object result = ic.proceed();
				
		notificationDao.create(notificationContext.create(((InterfaceDao<MarkerEntity>) ic.getTarget()).getNotificationFactory()));
		
		return result;
	}

}
