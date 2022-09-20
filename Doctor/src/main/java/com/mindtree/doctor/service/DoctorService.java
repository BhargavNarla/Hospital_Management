package com.mindtree.doctor.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.doctor.commonentity.Patient;
import com.mindtree.doctor.commonentity.ResponseTemplate;
import com.mindtree.doctor.entity.Doctor;
import com.mindtree.doctor.repository.DoctorRepository;

@Service
public class DoctorService implements DoctorServiceImpl{
	
	@Autowired
	DoctorRepository docrepo;
	
	@Autowired
	private RestTemplate res;

	@Override
	public Doctor createDoctor(Doctor doc) {
	
		return docrepo.save(doc);
	}

	@Override
	public List<Doctor> getDoctors() {
		
		return docrepo.findAll();
	}

	@Override
	public Doctor getDoctor(int id) {
		
		return docrepo.findById(id).orElse(null);
	}

	@Override
	public Doctor updateDoctor(Doctor doc) {
	
		
		Doctor olddoc=docrepo.findById(doc.getId()).orElse(null);
		olddoc.setId(doc.getId());
		olddoc.setDoctorName(doc.getDoctorName());
		olddoc.setDoctorAge(doc.getDoctorAge());
		olddoc.setDoctorGender(doc.getDoctorGender());
		olddoc.setPatientId(doc.getPatientId());
		
		return docrepo.save(olddoc);
		
	}

	@Override
	public void deleteDoctor(int id) {
		
		docrepo.deleteById(id);
		
		
	}
	
	public ResponseTemplate getAllPatientsWithDoctor(int id) {
		ResponseTemplate response=new ResponseTemplate();
		Doctor doc=docrepo.findById(id).get();
		response.setDoc(doc);
		
		List<Patient> pat=res.getForObject("http://PATIENT_SERVICE/patient/getpat/"+id,List.class);
		response.setPat(pat);
		return response;
		
		
		
	}
	
	
	

}
