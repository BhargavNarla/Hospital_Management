import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Doctorinfoclass } from 'src/app/doctorinfoclass.model';
import { Patientinfoclass } from 'src/app/patientinfoclass.model';
import { HospitalmanagementService } from 'src/app/service/hospitalmanagement.service';



@Component({
  selector: 'app-createpatient',
  templateUrl: './createpatient.component.html',
  styleUrls: ['./createpatient.component.css']
})
export class CreatepatientComponent implements OnInit {

  
  patient:Patientinfoclass=new Patientinfoclass();
  doctor:Doctorinfoclass[]=[];
 

  constructor(private pati:HospitalmanagementService){}
 
  ngOnInit(){
    

   this.pati.getAllDoctors().subscribe({
     next:(data)=>{
       this.doctor=data;
     }
   })

  }

  savePatient(){
    console.log(this.patient);
  
    this.pati.postPatientInfo(this.patient).subscribe();
    alert("Pateint added succesfully!!!!")
  }


}
