package br.ufes.inf.nemo.researcherAccreditation.domain;

import javax.persistence.Entity;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class Qualis extends PersistentObjectSupport {
	private String level;
	
	/* construtores */
	public Qualis() {
	
	}
	
	public Qualis(String level){
		this.level = level;
	}
	
	/* funções get/set */
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
