package com.mindtree.patient.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mindtree.patient.entity.Patient;
import com.mindtree.patient.service.PatientServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientServiceImpl patientservice;
	
	@PostMapping("/postpat")
	public Patient createPatient(@RequestBody Patient patient) {
		
		return patientservice.createPatient(patient);
		
	}
	
	@GetMapping("/getpat")
	public List<Patient> getpatients(){
		
		return patientservice.getpatients();
	}
	
	@GetMapping("/getpat/{id}")
	public Patient getPatient(@PathVariable int id) {
		
		return patientservice.getPatient(id);
	}
	
	@PutMapping("/updatepat")
	public Patient updatePatient(@RequestBody Patient patient) {
		
		return patientservice.upadtePatient(patient);
	}
	
	@DeleteMapping("/deletedoc/{id}")
	public ResponseEntity<String> deletePatient(@PathVariable int id){
		 patientservice.deletePatient(id);
		 return new ResponseEntity<String>("Patient deleted",HttpStatus.OK);
	 }

}
