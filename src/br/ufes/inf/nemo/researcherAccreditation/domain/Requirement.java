package br.ufes.inf.nemo.researcherAccreditation.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class Requirement extends PersistentObjectSupport {
	private String name;
	private int totalScore;
	private int journalScore;	
	@Temporal(TemporalType.DATE) 
	private Date beginDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	/* construtores */
	public Requirement() {
	
	}
	
	public Requirement(String name, int totalScore, int journalScore, Date beginDate, Date endDate){
		this.name = name;
		this.totalScore = totalScore;
		this.journalScore = journalScore;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	
	/* funções get/set */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public int getJournalScore() {
		return journalScore;
	}
	public void setJournalScore(int journalScore) {
		this.journalScore = journalScore;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}