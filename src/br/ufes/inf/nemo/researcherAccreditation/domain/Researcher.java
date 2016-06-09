package br.ufes.inf.nemo.researcherAccreditation.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class Researcher extends PersistentObjectSupport {
	
	private String researcherName;
	@Enumerated(EnumType.STRING)
    private Classification classification;
	
	/* Construtores */
	public Researcher() {
	
	}
	
	public Researcher(Classification classification, String name){
		this.classification = classification; 
		this.setResearcherName(name);
	}
	
	
	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public String getResearcherName() {
		return researcherName;
	}

	public void setResearcherName(String researcherName) {
		this.researcherName = researcherName;
	}
	
	
}
