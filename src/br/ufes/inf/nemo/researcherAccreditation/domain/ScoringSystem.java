package br.ufes.inf.nemo.researcherAccreditation.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class ScoringSystem extends PersistentObjectSupport {
	@Temporal(TemporalType.DATE) 
	private Date beginDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	/* Construtores */
	public ScoringSystem() {
		
	}
	
	public ScoringSystem(Date beginDate, Date endDate){
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	
	/* Funções set/get */
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
