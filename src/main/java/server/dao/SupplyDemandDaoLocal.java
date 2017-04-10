package server.dao;

import java.util.List;

import javax.ejb.Local;

import server.dao.entity.MemberEntity;
import server.dao.entity.SupplyDemandEntity;
import server.dao.interfaces.InterfaceDao;

@Local
public interface SupplyDemandDaoLocal extends InterfaceDao<SupplyDemandEntity>{
	
	public List<SupplyDemandEntity> getAllSupplyDemand();
	
	public List<SupplyDemandEntity> getSupplyDemand(MemberEntity memberEntity);
	
	public SupplyDemandEntity getSupplyDemandById(int id);
	
	//public void createSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	//public SupplyDemandDto getSupplyDemand(SupplyDemandDto supplyDemanDto);
	
	//public void updateSupplyDemand(SupplyDemandDto supplyDemandDto);
	
	//public void deleteSupplyDemand(SupplyDemandDto supplyDemanDto);

}
