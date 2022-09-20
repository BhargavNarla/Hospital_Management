import { Component, OnInit } from '@angular/core';
import { Doctorinfoclass } from 'src/app/doctorinfoclass.model';
import { HospitalmanagementService } from 'src/app/service/hospitalmanagement.service';

@Component({
  selector: 'app-createdoctor',
  templateUrl: './createdoctor.component.html',
  styleUrls: ['./createdoctor.component.css']
})
export class CreatedoctorComponent implements OnInit {

  doctor:Doctorinfoclass=new Doctorinfoclass();

  constructor(private doct:HospitalmanagementService) { }

  ngOnInit(): void {


  }



  saveDoctor(){
    console.log(this.doctor);
  
    this.doct.postDoctorInfo(this.doctor).subscribe();
    alert("Doctor added successfully!!!!");
    
  }

}
