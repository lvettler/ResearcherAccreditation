package br.ufes.inf.nemo.researcherAccreditation.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.researcherAccreditation.application.RegisterUserService;
import br.ufes.inf.nemo.researcherAccreditation.domain.User;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

@Named
@SessionScoped
public class RegisterUserController extends CrudController<User> {
	
	@EJB
    private RegisterUserService registerUserService;
	

    public RegisterUserController() {
        viewPath = "/manageUser/";
       bundleName = "msgs";
    }

	@Override
	protected CrudService<User> getCrudService() {
		// TODO Auto-generated method stub
		return registerUserService;
	}

	@Override
	protected User createNewEntity() {
		// TODO Auto-generated method stub
		return new User();
	}

	@Override
	protected void initFilters() {
		// TODO Auto-generated method stub
		
	}

   }
