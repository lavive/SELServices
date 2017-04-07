package server.dao;


import server.dao.interfaceDao.InterfaceDao;
import shared.dto.CatalogDto;
import shared.dto.GeneralOfferDto;

public interface CatalogDao extends InterfaceDao<CatalogDto>{

	//public void createCatalog(CatalogDto catalogDto);
	
	public CatalogDto getCatalog();
	
	public void addGeneralOffer(GeneralOfferDto generalOfferDto);
	
	public GeneralOfferDto getGeneralOffer(GeneralOfferDto generalOfferDto);
	
	public void updateGeneralOffer(GeneralOfferDto generalOfferDto);
	
	public void deleteGeneralOffer(GeneralOfferDto generalOfferDto);
	
	void updateCatalog();
}
