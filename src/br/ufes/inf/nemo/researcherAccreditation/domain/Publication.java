package br.ufes.inf.nemo.researcherAccreditation.domain;

import javax.persistence.Entity;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class Publication extends PersistentObjectSupport {
	private int year;
	private String name;
	private String venuieLattes;
	private String authorLattes;
	
	/* construtores */
	public Publication() {
		
	}
	
	public Publication(int year, String name, String venuieLattes, String authorLattes) {
		this.year = year;
		this.name = name;
		this.venuieLattes = venuieLattes;
		this.authorLattes = authorLattes;		
	}
	
	/* funções get/set */
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getVenuieLattes() {
		return venuieLattes;
	}
	
	public void setVenuieLattes(String venuieLattes) {
		this.venuieLattes = venuieLattes;
	}
	
	public String getAuthorLattes() {
		return authorLattes;
	}
	
	public void setAuthorLattes(String authorLattes) {
		this.authorLattes = authorLattes;
	}
	
}
