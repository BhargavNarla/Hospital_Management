package com.mindtree.doctor.commonentity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="patient_table")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String patientName;
	private String visitedDoctor;
	@DateTimeFormat(pattern="DD/MM/YYYY")
	private Date dateOfVisit;
	
	public Patient(int id, String patientName, String visitedDoctor, Date dateOfVisit) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.visitedDoctor = visitedDoctor;
		this.dateOfVisit = dateOfVisit;
	}
	
	
	public Patient() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	public Date getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	
	
	
	

}
