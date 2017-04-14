package server.notification.suscriber.interceptor.strategy.bean;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import server.notification.suscriber.SuscriberLocal;
import server.notification.suscriber.interceptor.strategy.SuscriberInterceptorAppStrategyLocal;
import server.notification.suscriber.interceptor.strategy.SuscriberInterceptorEmailStrategyLocal;
import server.notification.suscriber.interceptor.strategy.SuscriberInterceptorSmsStrategyLocal;
import server.notification.suscriber.interceptor.strategy.SuscriberInterceptorStrategy;
import server.notification.suscriber.interceptor.strategy.SuscriberInterceptorStrategyContextLocal;

@Singleton
public class SuscriberInterceptorStrategyContextBean implements SuscriberInterceptorStrategyContextLocal {
	
	@EJB
	private SuscriberInterceptorAppStrategyLocal suscriberInterceptorAppStrategy;
	
	@EJB
	private SuscriberInterceptorEmailStrategyLocal suscriberInterceptorEmailStrategy;
	
	@EJB
	private SuscriberInterceptorSmsStrategyLocal suscriberInterceptorSmsStrategy;
	
	
	private Map<String,SuscriberInterceptorStrategy> mapSuscriberInterceptorStrategy
			= new HashMap<String,SuscriberInterceptorStrategy>();
	
	private SuscriberInterceptorStrategyContextBean(){
		this.mapSuscriberInterceptorStrategy.put(EnumSuscriberInterceptorStrategy.APP_LONG_POLLING_STRATEGY.getWording(),
				suscriberInterceptorAppStrategy);
		this.mapSuscriberInterceptorStrategy.put(EnumSuscriberInterceptorStrategy.EMAIL_JAVAMAIL_STRATEGY.getWording(),
				suscriberInterceptorEmailStrategy);
		this.mapSuscriberInterceptorStrategy.put(EnumSuscriberInterceptorStrategy.SMS_LONG_POLLING_STRATEGY.getWording(),
				suscriberInterceptorSmsStrategy);
	}
	
	@Override
	public void execute(SuscriberLocal suscriber, String Strategy) {
		getSuscriberInterceptorStrategy(Strategy).execute(suscriber);
		
	}
	
	
	private SuscriberInterceptorStrategy getSuscriberInterceptorStrategy(String key){
		return mapSuscriberInterceptorStrategy.get(key);
	}

}
