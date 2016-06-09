package br.ufes.inf.nemo.researcherAccreditation.application;

import javax.ejb.Local;

import br.ufes.inf.nemo.researcherAccreditation.domain.Researcher;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
@Local
public interface RegisterResearcherService extends CrudService<Researcher>{

}
