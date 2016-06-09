package br.ufes.inf.nemo.researcherAccreditation.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.researcherAccreditation.application.RegisterRequirementService;
import br.ufes.inf.nemo.researcherAccreditation.domain.Requirement;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

@Named
@SessionScoped
public class RegisterRequirementController extends CrudController<Requirement> {

	@EJB
	private RegisterRequirementService registerRequirementService;
	
	public RegisterRequirementController() {
		viewPath = "/manageRequirement/";
		bundleName = "msgs";
	}
	
	@Override
	protected CrudService<Requirement> getCrudService() {
		// TODO Auto-generated method stub
		return registerRequirementService;
	}

	@Override
	protected Requirement createNewEntity() {
		// TODO Auto-generated method stub
		return new Requirement();
	}

	@Override
	protected void initFilters() {
		// TODO Auto-generated method stub
		
	}

}
