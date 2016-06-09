package br.ufes.inf.nemo.researcherAccreditation.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.researcherAccreditation.application.RegisterScoreService;
import br.ufes.inf.nemo.researcherAccreditation.domain.Score;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

@Named
@SessionScoped
public class RegisterScoreController extends CrudController<Score> {

	@EJB
	private RegisterScoreService registerScoreService;
	
	public RegisterScoreController() {
		viewPath = "/manageScore/";
		bundleName = "msgs";
	}
	
	@Override
	protected CrudService<Score> getCrudService() {
		// TODO Auto-generated method stub
		return registerScoreService;
	}

	@Override
	protected Score createNewEntity() {
		// TODO Auto-generated method stub
		return new Score();
	}

	@Override
	protected void initFilters() {
		// TODO Auto-generated method stub
		
	}

}
