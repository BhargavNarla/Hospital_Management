package com.mindtree.doctor.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mindtree.doctor.commonentity.ResponseTemplate;
import com.mindtree.doctor.entity.Doctor;
import com.mindtree.doctor.service.DoctorService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	DoctorService docservice;
	
	@PostMapping("/postdoc")
	public Doctor createDoctor(@RequestBody Doctor doc) {
		return docservice.createDoctor(doc);
	}

	@GetMapping("/getdoc")
	public List<Doctor> getDoctors(){
		return docservice.getDoctors();
		
	}
	
	@GetMapping("/getdoc/{id}")
	public Doctor getDoctor(@PathVariable int id) {
		return docservice.getDoctor(id);
	}
	
	
	@PutMapping("/updatedoc")
	public Doctor updateDoctor(@RequestBody Doctor doc) {
		return docservice.updateDoctor(doc);
	}
	
	@DeleteMapping("/deletedoc/{id}")
	public ResponseEntity<String> deleteDoctor(@PathVariable int id){
		 docservice.deleteDoctor(id);
		 return new ResponseEntity<String>("Doctor deleted",HttpStatus.OK);
	 }
	
	@GetMapping("/patdoc/{id}")
	public ResponseTemplate getAllPatientsWithDoctor(@PathVariable int id) {
		return docservice.getAllPatientsWithDoctor(id);
	}
	
	
}
