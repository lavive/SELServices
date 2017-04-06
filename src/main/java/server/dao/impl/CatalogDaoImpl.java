package server.dao.impl;


import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import server.dao.CatalogDao;
import shared.CatalogDto;
import shared.GeneralOfferDto;


@Named(value = "service.dao.CatalogDao")
@Singleton
public class CatalogDaoImpl implements CatalogDao{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	@Transactional
	public void addGeneralOffer(GeneralOfferDto generalOfferDto){
		
	}

	@Override
	public void create(CatalogDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CatalogDto get(CatalogDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(CatalogDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CatalogDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CatalogDto getCatalog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GeneralOfferDto getGeneralOffer(GeneralOfferDto generalOfferDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateGeneralOffer(GeneralOfferDto generalOfferDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGeneralOffer(GeneralOfferDto generalOfferDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCatalog() {
		// TODO Auto-generated method stub
		
	}
	
	
//	public void create(CatalogDto catalogDto){
//		
//	}
	
	
//	public List<Actualite> getActualites() {
//		String query = "from Actualite where date<=current_date order by date desc, id desc";
//
//		TypedQuery<Actualite> listeActualitesQuery = this.entityManager.createQuery(query, Actualite.class);
//
//		return listeActualitesQuery.getResultList();
//	}
//
//	@Override
//	@Transactional
//	public Actualite creerOuMettreAJour(Actualite actualite) {
//		this.entityManager.merge(actualite);
//		this.entityManager.flush();
//
//		return actualite;
//	}

}
