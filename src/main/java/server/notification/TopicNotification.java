package server.notification;

import shared.CategoryDto;
import shared.interfaceDto.PersonDto;

public interface TopicNotification {
	
	public EnumTopicNotification getTopic();
	
	public PersonDto getOrigin();
	
	public CategoryDto getCategory();

}
