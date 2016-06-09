package br.ufes.inf.nemo.researcherAccreditation.application;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.researcherAccreditation.domain.Score;
import br.ufes.inf.nemo.researcherAccreditation.persistence.ScoreDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

@Stateless
public class RegisterScoreServiceBean extends CrudServiceBean<Score> implements RegisterScoreService {

	@EJB
	private ScoreDAO scoreDAO;
	
	@Override
	public BaseDAO<Score> getDAO() {
		// TODO Auto-generated method stub
		return scoreDAO;
	}

	@Override
	protected Score createNewEntity() {
		return new Score();
	}

}
