package br.ufes.inf.nemo.researcherAccreditation.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.inf.nemo.researcherAccreditation.domain.Score;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseJPADAO;

@Stateless
public class ScoreJPADAO extends BaseJPADAO<Score> implements ScoreDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Class<Score> getDomainClass() {
		// TODO Auto-generated method stub
		return Score.class;
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}

}
