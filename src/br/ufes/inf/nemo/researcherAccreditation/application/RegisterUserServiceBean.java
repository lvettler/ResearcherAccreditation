package br.ufes.inf.nemo.researcherAccreditation.application;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.researcherAccreditation.domain.User;
import br.ufes.inf.nemo.researcherAccreditation.persistence.UserDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

@Stateless
public class RegisterUserServiceBean extends CrudServiceBean<User> implements RegisterUserService {

	@EJB
	private UserDAO userDAO;

	@Override
	public BaseDAO<User> getDAO() {
		// TODO Auto-generated method stub
		return userDAO;
	}

	@Override 
	protected User createNewEntity() {
		return new User();
	}
	
	
	
}
