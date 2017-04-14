package server.service.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import server.dao.SupplyDemandDaoLocal;
import server.dao.entity.SupplyDemandEntity;
import server.service.ManageSupplyDemandRemote;
import server.service.transform.EntityToDto;
import shared.dto.SupplyDemandDto;



@Stateless
public class ManageSupplyDemandBean implements ManageSupplyDemandRemote {
	
	@EJB
	private SupplyDemandDaoLocal supplyDemandDao;

	
	@Override
	public List<SupplyDemandDto> retrieveAllSupplyDemands() {
		List<SupplyDemandDto> supplyDemands = new ArrayList<SupplyDemandDto>();
		for(SupplyDemandEntity supplyDemand:supplyDemandDao.getAllSupplyDemand()){
			supplyDemands.add(EntityToDto.supplyDemandEntityToDto(supplyDemand));
		}
		
		return supplyDemands;
	}

	@Override
	public SupplyDemandDto retrieveSupplyDemand(int supplyDemanId) {
		
		return EntityToDto.supplyDemandEntityToDto(supplyDemandDao.getSupplyDemandById(supplyDemanId));
	}

	@Override
	public void deleteSupplyDemand(int supplyDemanId) {
		
		supplyDemandDao.delete(supplyDemandDao.getSupplyDemandById(supplyDemanId));
	}

}
