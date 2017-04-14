package server.service;

import java.util.List;

import javax.ejb.Remote;

import shared.dto.SupplyDemandDto;


@Remote
public interface ManageSupplyDemandRemote{
	
	public List<SupplyDemandDto> retrieveAllSupplyDemands();
	
	public SupplyDemandDto retrieveSupplyDemand(int supplyDemanId);
	
	public void deleteSupplyDemand(int supplyDemanId);

}
