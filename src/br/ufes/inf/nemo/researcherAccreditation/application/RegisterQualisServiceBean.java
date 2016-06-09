package br.ufes.inf.nemo.researcherAccreditation.application;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.researcherAccreditation.domain.Qualis;
import br.ufes.inf.nemo.researcherAccreditation.persistence.QualisDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

@Stateless
public class RegisterQualisServiceBean extends CrudServiceBean<Qualis> implements RegisterQualisService {

	@EJB
	private QualisDAO qualisDAO;
	
	@Override
	public BaseDAO<Qualis> getDAO() {
		// TODO Auto-generated method stub
		return qualisDAO;
	}

	@Override
	protected Qualis createNewEntity() {
		return new Qualis();
	}

}
