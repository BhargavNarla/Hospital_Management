import { Component, OnInit } from '@angular/core';
import { Doctorinfoclass } from 'src/app/doctorinfoclass.model';
import { HospitalmanagementService } from 'src/app/service/hospitalmanagement.service';

@Component({
  selector: 'app-doctorinfo',
  templateUrl: './doctorinfo.component.html',
  styleUrls: ['./doctorinfo.component.css']
})
export class DoctorinfoComponent implements OnInit {

  // object created to doctor model
  public doctor:Doctorinfoclass={} as Doctorinfoclass;

  public doctorName:any;

  public doctors:Doctorinfoclass[]=[];

  constructor(private service:HospitalmanagementService) { }

  ngOnInit(): void {
    // to get data of particular doctor by name

    this.service.getAllDoctors().subscribe({
      next:(data)=>{
        this.doctors=data;
      }
    });  

  }


  doctorSearch(){
    if(this.doctorName==""){
      this.ngOnInit();
    }else{
      this.doctors=this.doctors.filter(res=>{
        return res.doctorName.toLocaleLowerCase().match(this.doctorName.toLocaleLowerCase());
      });
    }
  }

}
