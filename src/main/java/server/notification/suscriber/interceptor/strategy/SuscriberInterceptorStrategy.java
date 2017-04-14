package server.notification.suscriber.interceptor.strategy;

import server.notification.suscriber.SuscriberLocal;

public interface SuscriberInterceptorStrategy {
	
	public void execute(SuscriberLocal suscriber);

}
