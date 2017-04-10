package server.dao;


import javax.ejb.Local;

import server.dao.entity.CatalogEntity;
import server.dao.entity.GeneralOfferEntity;
import server.dao.interfaces.InterfaceDao;

@Local
public interface CatalogDaoLocal extends InterfaceDao<CatalogEntity>{

	//public void createCatalog(CatalogDto catalogDto);
	
	public CatalogEntity getCatalog();
	
	public void addGeneralOffer(GeneralOfferEntity generalOfferEntity);
	
	public GeneralOfferEntity getGeneralOffer(GeneralOfferEntity generalOfferEntity);
	
	public void updateGeneralOffer(GeneralOfferEntity generalOfferEntity);
	
	public void deleteGeneralOffer(GeneralOfferEntity generalOfferEntity);
	
	void updateCatalog();
}
