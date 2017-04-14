package server.notification.suscriber.interceptor.strategy;

import javax.ejb.Local;

import server.notification.suscriber.SuscriberLocal;

@Local
public interface SuscriberInterceptorStrategyContextLocal {
	
	public void execute(SuscriberLocal suscriber, String Strategy);

}
