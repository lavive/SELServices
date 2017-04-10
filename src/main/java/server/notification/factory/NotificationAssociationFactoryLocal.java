package server.notification.factory;

import java.util.Map;

import server.dao.constantes.EnumAssociationAttribute;

public interface NotificationAssociationFactoryLocal extends NotificationFactory {

	public void setMapAttributeValue(Map<EnumAssociationAttribute,String> mapAttributeValue);
}
