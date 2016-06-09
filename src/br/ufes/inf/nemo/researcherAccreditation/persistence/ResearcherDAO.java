package br.ufes.inf.nemo.researcherAccreditation.persistence;

import javax.ejb.Local;

import br.ufes.inf.nemo.researcherAccreditation.domain.Researcher;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

@Local
public interface ResearcherDAO extends BaseDAO<Researcher> {

}
