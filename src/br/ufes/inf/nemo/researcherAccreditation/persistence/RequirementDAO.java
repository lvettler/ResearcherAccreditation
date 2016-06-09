package br.ufes.inf.nemo.researcherAccreditation.persistence;

import javax.ejb.Local;

import br.ufes.inf.nemo.researcherAccreditation.domain.Requirement;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

@Local
public interface RequirementDAO extends BaseDAO<Requirement> {

}
