package br.ufes.inf.nemo.researcherAccreditation.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.inf.nemo.researcherAccreditation.domain.Publication;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseJPADAO;

@Stateless
public class PublicationJPADAO extends BaseJPADAO<Publication> implements PublicationDAO {

	@PersistenceContext
	private EntityManager entityManager;
		
	@Override
	public Class<Publication> getDomainClass() {
		// TODO Auto-generated method stub
		return Publication.class;
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}

}
