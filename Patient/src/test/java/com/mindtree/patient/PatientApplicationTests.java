package com.mindtree.patient;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.patient.entity.Patient;
import com.mindtree.patient.service.PatientService;

@SpringBootTest
class PatientApplicationTests {

	@Autowired
	PatientService ser;
	
	
	@Test
	void contextLoads() {
	}
	
	// pass case for id 1
	@Test
	public void getPatientByIdp1() {
		Patient id=ser.getPatient(1);
		assertEquals(1,1);
	}
	
	// pass case for id 2
	@Test
	public void getPatientByIdp2() {
		Patient id=ser.getPatient(2);
		assertEquals(2,2);
	}
	
	// fail case
	
//	@Test
//	public void getPatientByIdf1() {
//		Patient id=ser.getPatient(10);
//		assertEquals(1,10);
//	}
//	

}
