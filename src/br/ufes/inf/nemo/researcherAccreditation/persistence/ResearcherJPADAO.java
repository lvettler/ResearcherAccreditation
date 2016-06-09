package br.ufes.inf.nemo.researcherAccreditation.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.inf.nemo.researcherAccreditation.domain.Researcher;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseJPADAO;
@Stateless
public class ResearcherJPADAO extends BaseJPADAO<Researcher> implements ResearcherDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Class<Researcher> getDomainClass() {
		// TODO Auto-generated method stub
		return Researcher.class;
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}

}
