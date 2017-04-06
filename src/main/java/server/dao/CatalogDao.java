package server.dao;


import server.dao.interfaceDao.InterfaceDao;
import shared.CatalogDto;
import shared.GeneralOfferDto;

public interface CatalogDao extends InterfaceDao<CatalogDto>{

	//public void createCatalog(CatalogDto catalogDto);
	
	public CatalogDto getCatalog();
	
	public void addGeneralOffer(GeneralOfferDto generalOfferDto);
	
	public GeneralOfferDto getGeneralOffer(GeneralOfferDto generalOfferDto);
	
	public void updateGeneralOffer(GeneralOfferDto generalOfferDto);
	
	public void deleteGeneralOffer(GeneralOfferDto generalOfferDto);
	
	void updateCatalog();
}
