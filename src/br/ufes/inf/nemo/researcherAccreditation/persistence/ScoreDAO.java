package br.ufes.inf.nemo.researcherAccreditation.persistence;

import javax.ejb.Local;

import br.ufes.inf.nemo.researcherAccreditation.domain.Score;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

@Local
public interface ScoreDAO extends BaseDAO<Score> {

}
