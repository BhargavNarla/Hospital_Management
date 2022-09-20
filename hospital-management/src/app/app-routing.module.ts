import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreatedoctorComponent } from './components/createdoctor/createdoctor.component';
import { CreatepatientComponent } from './components/createpatient/createpatient.component';
import { DoctorinfoComponent } from './components/doctorinfo/doctorinfo.component';
import { HomeComponent } from './components/home/home.component';
import { PatientinfoComponent } from './components/patientinfo/patientinfo.component';


const routes: Routes = [
{
  component:DoctorinfoComponent,
  path:'doctorinfo',
},

{
  component:PatientinfoComponent,
  path:'patientinfo'
},

{
  component:CreatedoctorComponent,
  path:'cdoctor',
},

{
  component:CreatepatientComponent,
  path:'cpatient',
},

{
  component:HomeComponent,
  path:'',
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
