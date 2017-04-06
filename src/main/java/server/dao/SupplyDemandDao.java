package server.dao;

import java.util.List;

import server.dao.interfaceDao.InterfaceDao;
import shared.SupplyDemandDto;

public interface SupplyDemandDao extends InterfaceDao<SupplyDemandDto>{
	
	public List<SupplyDemandDto> getAllSupplyDemand();
	
	//public void createSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	//public SupplyDemandDto getSupplyDemand(SupplyDemandDto supplyDemanDto);
	
	//public void updateSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	//public void deleteSupplyDemand(SupplyDemandDto supplyDemanDto);

}
