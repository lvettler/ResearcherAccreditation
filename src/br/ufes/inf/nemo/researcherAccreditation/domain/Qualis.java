package br.ufes.inf.nemo.researcherAccreditation.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class Qualis extends PersistentObjectSupport  {
	private String level;
	@OneToMany
	private Set<Score> l_Score;
	
	public Set<Score> getL_Score() {
		return l_Score;
	}

	public void setL_Score(Set<Score> l_Score) {
		this.l_Score = l_Score;
	}

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
