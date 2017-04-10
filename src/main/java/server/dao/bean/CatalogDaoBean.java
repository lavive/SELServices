package server.dao.bean;


import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import server.dao.CatalogDaoLocal;
import server.dao.entity.CatalogEntity;
import server.dao.entity.GeneralOfferEntity;
import server.notification.factory.NotificationFactory;


@Named(value = "service.dao.CatalogDao")
@Singleton
public class CatalogDaoBean implements CatalogDaoLocal{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	@Transactional
	public void addGeneralOffer(GeneralOfferEntity generalOfferEntity){
		
	}

	@Override
	public void create(CatalogEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CatalogEntity get(CatalogEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(CatalogEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CatalogEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CatalogEntity getCatalog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GeneralOfferEntity getGeneralOffer(GeneralOfferEntity generalOfferEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateGeneralOffer(GeneralOfferEntity generalOfferEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGeneralOffer(GeneralOfferEntity generalOfferEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCatalog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NotificationFactory getNotificationFactory() {
		// TODO Auto-generated method stub
		return null;
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
