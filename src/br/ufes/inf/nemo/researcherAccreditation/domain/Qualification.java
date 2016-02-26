package br.ufes.inf.nemo.researcherAccreditation.domain;

import javax.persistence.Entity;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class Qualification extends PersistentObjectSupport {
	private int year;
	
	/* construtores */
	public Qualification() {
		
	}
	
	public Qualification(int year){
		this.year = year;
	}
	
	/* funções get/set */
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
