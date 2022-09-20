package com.mindtree.patient.service;

import java.util.List;

import com.mindtree.patient.entity.Patient;
import org.springframework.stereotype.Service;

@Service
public interface PatientServiceImpl {
	
	public Patient createPatient(Patient patient);
	
	public List<Patient> getpatients();
	
	public Patient getPatient(int id);
	
	public Patient upadtePatient(Patient patient);
	
	public void deletePatient(int id);

}
