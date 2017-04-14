package server.notification.suscriber.interceptor.strategy.bean;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import server.dao.NotificationsMemberDaoLocal;
import server.notification.suscriber.SuscriberLocal;
import server.notification.suscriber.interceptor.strategy.SuscriberInterceptorSmsStrategyLocal;

@Singleton
public class SuscriberInterceptorSmsStrategyBean implements SuscriberInterceptorSmsStrategyLocal {
	
	@EJB
	NotificationsMemberDaoLocal notificationsMemberDao;

	@Override
	public void execute(SuscriberLocal suscriber) {
		/**
		 * rajouter une condition vérifiant si le membre a renseigné son n° de portable
		 */
		
		SuscriberUtil.upDateNotificationsMember(suscriber, this.notificationsMemberDao);		

	}

}
