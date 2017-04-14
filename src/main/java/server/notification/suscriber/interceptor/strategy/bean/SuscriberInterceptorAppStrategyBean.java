package server.notification.suscriber.interceptor.strategy.bean;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import server.dao.NotificationsMemberDaoLocal;
import server.notification.suscriber.SuscriberLocal;
import server.notification.suscriber.interceptor.strategy.SuscriberInterceptorAppStrategyLocal;

@Singleton
public class SuscriberInterceptorAppStrategyBean implements SuscriberInterceptorAppStrategyLocal {
	
	@EJB
	NotificationsMemberDaoLocal notificationsMemberDao;

	@Override
	public void execute(SuscriberLocal suscriber) {
		/**
		 * rajouter une condition vérifiant si le membre possède l'appli mobile
		 */
		
		SuscriberUtil.upDateNotificationsMember(suscriber, this.notificationsMemberDao);

	}

}
