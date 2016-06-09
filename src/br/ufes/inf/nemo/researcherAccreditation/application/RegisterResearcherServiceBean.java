package br.ufes.inf.nemo.researcherAccreditation.application;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.researcherAccreditation.domain.Researcher;
import br.ufes.inf.nemo.researcherAccreditation.domain.Score;
import br.ufes.inf.nemo.researcherAccreditation.persistence.ResearcherDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

@Stateless
public class RegisterResearcherServiceBean extends CrudServiceBean<Researcher> implements RegisterResearcherService  {

	@EJB
	private ResearcherDAO researcherDAO;
	
	@Override
	public BaseDAO<Researcher> getDAO() {
		// TODO Auto-generated method stub
		return researcherDAO;
	}

	@Override
	protected Researcher createNewEntity() {
		// TODO Auto-generated method stub
		return new Researcher();
	}

}
