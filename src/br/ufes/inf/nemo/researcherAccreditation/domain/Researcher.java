package br.ufes.inf.nemo.researcherAccreditation.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class Researcher extends PersistentObjectSupport {
	private String linkCurriculumLattes;
	@Enumerated(EnumType.STRING)
    private Classification classification;
	
	/* Construtores */
	public Researcher() {
	
	}
	
	public Researcher(String linkCurriculumLattes, Classification classification){
		this.linkCurriculumLattes = linkCurriculumLattes;
		this.classification = classification; 
	}
	
	/* Funções get/set */
	public String getLinkCurriculumLattes() {
		return linkCurriculumLattes;
	}

	public void setLinkCurriculumLattes(String linkCurriculumLattes) {
		this.linkCurriculumLattes = linkCurriculumLattes;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	
	
}
