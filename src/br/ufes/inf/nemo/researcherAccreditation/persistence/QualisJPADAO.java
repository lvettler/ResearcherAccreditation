package br.ufes.inf.nemo.researcherAccreditation.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.inf.nemo.researcherAccreditation.domain.Qualis;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseJPADAO;

@Stateless
public class QualisJPADAO extends BaseJPADAO<Qualis> implements QualisDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Class<Qualis> getDomainClass() {
		// TODO Auto-generated method stub
		return Qualis.class;
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}

}
