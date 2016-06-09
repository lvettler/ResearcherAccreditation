package br.ufes.inf.nemo.researcherAccreditation.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class Score extends PersistentObjectSupport {
	private int nationalScore;
	private int internationalScore;
	@ManyToOne
	private ScoringSystem scoringSystem;
	
	/* Construtores */
	public Score() {
		
	}	
	
	public ScoringSystem getScoringSystem() {
		return scoringSystem;
	}

	public void setScoringSystem(ScoringSystem scoringSystem) {
		this.scoringSystem = scoringSystem;
	}

	public Score(int nationalScore, int internationalScore){
		this.nationalScore = nationalScore;
		this.internationalScore = internationalScore;
	}
	
	/* Funções set/get */
	public int getNationalScore() {
		return nationalScore;
	}
	public void setNationalScore(int nationalScore) {
		this.nationalScore = nationalScore;
	}
	public int getInternationalScore() {
		return internationalScore;
	}
	public void setInternationalScore(int internationalScore) {
		this.internationalScore = internationalScore;
	}

}
