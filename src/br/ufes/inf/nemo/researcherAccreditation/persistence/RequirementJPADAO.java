package br.ufes.inf.nemo.researcherAccreditation.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.inf.nemo.researcherAccreditation.domain.Requirement;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseJPADAO;

@Stateless
public class RequirementJPADAO extends BaseJPADAO<Requirement> implements RequirementDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Class<Requirement> getDomainClass() {
		// TODO Auto-generated method stub
		return Requirement.class;
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}

}
