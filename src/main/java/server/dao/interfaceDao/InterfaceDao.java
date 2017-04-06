package server.dao.interfaceDao;

import shared.interfaceDto.MarkerDto;

public interface InterfaceDao<DTO extends MarkerDto> {
	
	public void create(DTO dto);
	
	public DTO get(DTO dto);
	
	public void update(DTO dto);
	
	public void delete(DTO dto);

}
