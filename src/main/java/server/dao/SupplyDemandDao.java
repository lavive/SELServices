package server.dao;

import java.util.List;

import server.dao.interfaceDao.InterfaceDao;
import shared.dto.MemberDto;
import shared.dto.SupplyDemandDto;

public interface SupplyDemandDao extends InterfaceDao<SupplyDemandDto>{
	
	public List<SupplyDemandDto> getAllSupplyDemand();
	
	public List<SupplyDemandDto> getSupplyDemand(MemberDto memberDto);
	
	public SupplyDemandDto getSupplyDemandById(int id);
	
	//public void createSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	//public SupplyDemandDto getSupplyDemand(SupplyDemandDto supplyDemanDto);
	
	//public void updateSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	//public void deleteSupplyDemand(SupplyDemandDto supplyDemanDto);

}
