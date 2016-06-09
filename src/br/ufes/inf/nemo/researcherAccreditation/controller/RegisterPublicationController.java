package br.ufes.inf.nemo.researcherAccreditation.controller;


import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.researcherAccreditation.application.RegisterPublicationService;
import br.ufes.inf.nemo.researcherAccreditation.domain.Publication;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

@Named
@SessionScoped
public class RegisterPublicationController extends CrudController<Publication>{

	@EJB
	private RegisterPublicationService registerPublicationService;
		
	public RegisterPublicationController() {
		viewPath = "/manageUser/";
		bundleName = "msgs";
	}

	@Override
	protected CrudService<Publication> getCrudService() {
		// TODO Auto-generated method stub
		return registerPublicationService;
	}

	@Override
	protected Publication createNewEntity() {
		// TODO Auto-generated method stub
		return new Publication();
	}

	@Override
	protected void initFilters() {
		// TODO Auto-generated method stub
		
	}

}
