package br.ufes.inf.nemo.researcherAccreditation.application;

import javax.ejb.Local;

import br.ufes.inf.nemo.researcherAccreditation.domain.Requirement;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;

@Local
public interface RegisterRequirementService extends CrudService<Requirement> {

}
