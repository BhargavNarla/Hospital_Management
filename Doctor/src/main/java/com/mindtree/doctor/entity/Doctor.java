package com.mindtree.doctor.entity;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="doctor_table")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String doctorName;
	private int doctorAge;
	private String doctorGender;
	private String doctorSpecilization;
	private int patientId;
	
	

	public Doctor(int id, String doctorName, int doctorAge, String doctorGender, String doctorSpecilization, int patientId) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorGender = doctorGender;
		this.doctorSpecilization = doctorSpecilization;
		this.patientId = patientId;
		
	}

	public Doctor() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getDoctorAge() {
		return doctorAge;
	}
	public void setDoctorAge(int doctorAge) {
		this.doctorAge = doctorAge;
	}
	public String getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	public String getDoctorSpecilization() {
		return doctorSpecilization;
	}
	public void setDoctorSpecilization(String doctorSpecilization) {
		this.doctorSpecilization = doctorSpecilization;
	}
	
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	
	
	
	
	
	

}
