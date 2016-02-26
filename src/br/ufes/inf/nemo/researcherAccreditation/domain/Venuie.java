package br.ufes.inf.nemo.researcherAccreditation.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class Venuie extends PersistentObjectSupport {
	private String name;	
	@Enumerated(EnumType.STRING)
    private Scape scape;
	@Enumerated(EnumType.STRING)
	private Category category;
	
	/* Construtores */
	public Venuie() {
		
	}
	
	public Venuie(String name, Scape scape, Category category) {
		this.name = name;
		this.scape = scape;
		this.category = category;
	}
	
	/* Funções set/get */
	public Scape getScape() {
		return scape;
	}

	public void setScape(Scape scape) {
		this.scape = scape;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
