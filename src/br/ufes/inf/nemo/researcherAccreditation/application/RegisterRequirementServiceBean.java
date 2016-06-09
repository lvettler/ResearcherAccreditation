package br.ufes.inf.nemo.researcherAccreditation.application;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.researcherAccreditation.domain.Requirement;
import br.ufes.inf.nemo.researcherAccreditation.persistence.RequirementDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

@Stateless
public class RegisterRequirementServiceBean extends CrudServiceBean<Requirement> implements RegisterRequirementService {
	
	@EJB
	private RequirementDAO requirementDAO;

	@Override
	public BaseDAO<Requirement> getDAO() {
		// TODO Auto-generated method stub
		return requirementDAO;
	}

	@Override
	protected Requirement createNewEntity() {
		return new Requirement();
	}
	

}
