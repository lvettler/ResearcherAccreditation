package br.ufes.inf.nemo.researcherAccreditation.persistence;

import javax.ejb.Local;

import br.ufes.inf.nemo.researcherAccreditation.domain.Publication;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

@Local
public interface PublicationDAO extends BaseDAO<Publication> {

}
