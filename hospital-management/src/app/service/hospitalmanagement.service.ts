import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Doctorinfoclass } from '../doctorinfoclass.model';
import { Patientinfoclass } from '../patientinfoclass.model';

@Injectable({
  providedIn: 'root'
})
export class HospitalmanagementService {

  constructor(private http:HttpClient) { }

  // method to adding patient data to db
  postPatientInfo(patient?:Patientinfoclass):Observable<Object>{
    return this.http.post<Object>("http://localhost:7019/patient/postpat",patient);
  }

  // method to adding doctor data to db
  postDoctorInfo(doctor?:Doctorinfoclass):Observable<Object>{
    return this.http.post<Object>("http://localhost:7018/doctor/postdoc",doctor);
  }


  // method to getting patient data from db by id
  getAllPatients():Observable<Patientinfoclass[]>{
    return this.http.get<any>("http://localhost:7019/patient/getpat");
  }


//  method to getting doctor data from db by name
  getAllDoctors():Observable<Doctorinfoclass[]>{
    return this.http.get<any>(`http://localhost:7018/doctor/getdoc/${name}`);
  }

  



}
