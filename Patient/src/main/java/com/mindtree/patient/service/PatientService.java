package com.mindtree.patient.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.patient.entity.Patient;
import com.mindtree.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class PatientService implements PatientServiceImpl {
	
	@Autowired
	PatientRepository patientrepo;

	@Override
	public Patient createPatient(Patient patient) {
		
		return patientrepo.save(patient);
	}

	@Override
	public List<Patient> getpatients() {
		
		return patientrepo.findAll();
	}

	@Override
	public Patient getPatient(int id) {
		
		return patientrepo.findById(id).orElse(null);
	}

	@Override
	public Patient upadtePatient(Patient patient) {
		
		Patient oldpatient=patientrepo.findById(patient.getId()).orElse(null);
		oldpatient.setId(patient.getId());
		oldpatient.setPatientName(patient.getPatientName());
		oldpatient.setVisitedDoctor(patient.getVisitedDoctor());
		oldpatient.setDateOfVisit(patient.getDateOfVisit());
		
		return patientrepo.save(oldpatient);
	
	}

	@Override
	public void deletePatient(int id) {
		
		patientrepo.deleteById(id);
		
	}
	
	
	

}
