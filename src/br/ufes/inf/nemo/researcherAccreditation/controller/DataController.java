package br.ufes.inf.nemo.researcherAccreditation.controller;

import br.ufes.inf.nemo.researcherAccreditation.domain.ScoringSystem;
import br.ufes.inf.nemo.researcherAccreditation.persistence.ScoringSystemDAO;
import br.ufes.inf.nemo.util.ejb3.controller.PersistentObjectConverterFromId;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.convert.Converter;
import javax.inject.Named;

@Named
@ApplicationScoped
public class DataController implements Serializable {

    @EJB
    private ScoringSystemDAO scoringSystemDAO;

    public List<ScoringSystem> getScoringSystem() {
        return scoringSystemDAO.retrieveAll();
    }

    public Converter getScoringConverter() {
        return new PersistentObjectConverterFromId<>(scoringSystemDAO);
    }
}