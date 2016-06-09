package br.ufes.inf.nemo.researcherAccreditation.application;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.researcherAccreditation.domain.Publication;
import br.ufes.inf.nemo.researcherAccreditation.persistence.PublicationDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

@Stateless
public class RegisterPublicationServiceBean extends CrudServiceBean<Publication> {

	@EJB
	private PublicationDAO publicationDAO;
	
	@Override
	public BaseDAO<Publication> getDAO() {
		// TODO Auto-generated method stub
		return publicationDAO;
	}

	@Override
	protected Publication createNewEntity() {
		// TODO Auto-generated method stub
		return new Publication();
	}

}
