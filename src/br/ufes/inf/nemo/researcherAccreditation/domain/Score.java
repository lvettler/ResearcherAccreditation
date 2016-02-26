package br.ufes.inf.nemo.researcherAccreditation.domain;

import javax.persistence.Entity;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class Score extends PersistentObjectSupport {
	private int nationalScore;
	private int internationalScore;
	
	/* Construtores */
	public Score() {
		
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
