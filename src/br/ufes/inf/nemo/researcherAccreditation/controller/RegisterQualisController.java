package br.ufes.inf.nemo.researcherAccreditation.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.researcherAccreditation.application.RegisterQualisService;
import br.ufes.inf.nemo.researcherAccreditation.domain.Qualis;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

@Named
@SessionScoped
public class RegisterQualisController extends CrudController<Qualis> {
	
	@EJB
	private RegisterQualisService registerQualisService;
	
	public RegisterQualisController(){
		viewPath = "/manageQualis/";
		bundleName = "msgs";
	}

	@Override
	protected CrudService<Qualis> getCrudService() {
		// TODO Auto-generated method stub
		return registerQualisService;
	}

	@Override
	protected Qualis createNewEntity() {
		// TODO Auto-generated method stub
		return new Qualis();
	}

	@Override
	protected void initFilters() {
		// TODO Auto-generated method stub
		
	}
	

}
