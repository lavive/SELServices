package server.notification.suscriber.interceptor;

import javax.ejb.EJB;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import server.notification.suscriber.SuscriberLocal;
import server.notification.suscriber.interceptor.strategy.SuscriberInterceptorStrategyContextLocal;
import server.notification.suscriber.interceptor.strategy.bean.EnumSuscriberInterceptorStrategy;

public class SuscriberForSMSInterceptor implements SuscriberInterceptor {
	
	@EJB
	SuscriberInterceptorStrategyContextLocal suscriberInterceptorStrategyContext;
	
	@Override
	@AroundInvoke
	public Object interceptSuscriber(InvocationContext ic) throws Exception {
		Object result = ic.proceed();
		
		SuscriberLocal suscriber = (SuscriberLocal) ic.getTarget();
		
		suscriberInterceptorStrategyContext.execute(suscriber, 
				EnumSuscriberInterceptorStrategy.SMS_LONG_POLLING_STRATEGY.getWording());

		
		return result;
		
	}

}
