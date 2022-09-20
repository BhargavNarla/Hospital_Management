package com.mindtree.doctor.commonentity;

import java.util.List;

import com.mindtree.doctor.entity.Doctor;

public class ResponseTemplate {

	
	private Doctor doc;
	private List<Patient> pat;
	
	public ResponseTemplate(Doctor doc, List<Patient> pat) {
		super();
		this.doc = doc;
		this.pat = pat;
	}
	
	
	public ResponseTemplate() {
		super();
	}

	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	public List<Patient> getPat() {
		return pat;
	}
	public void setPat(List<Patient> pat) {
		this.pat = pat;
	}


	
	
	
	
	
	
	
}
