package com.mindtree.doctor.service;

import java.util.List;

import com.mindtree.doctor.entity.Doctor;
import org.springframework.stereotype.Service;

@Service
public interface DoctorServiceImpl {
	
	
    public Doctor createDoctor(Doctor doc);
	
	public List<Doctor> getDoctors();
	
	public Doctor getDoctor(int id);
	
	public Doctor updateDoctor(Doctor doc);
	
	public void deleteDoctor(int id);

}
