import { Component, OnInit } from '@angular/core';
import { Patientinfoclass } from 'src/app/patientinfoclass.model';
import { HospitalmanagementService } from 'src/app/service/hospitalmanagement.service';


@Component({
  selector: 'app-patientinfo',
  templateUrl: './patientinfo.component.html',
  styleUrls: ['./patientinfo.component.css']
})
export class PatientinfoComponent implements OnInit {

  patients:Patientinfoclass[]=[];

  public patient:Patientinfoclass={} as Patientinfoclass;

  public id:any;

  constructor(private ser:HospitalmanagementService) { }

  ngOnInit(): void {

    // to get data of particular patient by id

    this.ser.getAllPatients().subscribe({
     next:(data)=>{
       
       this.patients=data;
     }
    });

  }


  patientSearch(){
    if(this.id==0){
      this.ngOnInit();
    }else{
      this.patients=this.patients.filter(res=>{
        return this.id==res.id;
      })
    }
  }
 
}
