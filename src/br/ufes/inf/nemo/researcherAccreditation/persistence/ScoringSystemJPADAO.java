package br.ufes.inf.nemo.researcherAccreditation.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.inf.nemo.researcherAccreditation.domain.ScoringSystem;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseJPADAO;

@Stateless
public class ScoringSystemJPADAO extends BaseJPADAO<ScoringSystem> implements ScoringSystemDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Class<ScoringSystem> getDomainClass() {
		// TODO Auto-generated method stub
		return ScoringSystem.class;
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}

}
