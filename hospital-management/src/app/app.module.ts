import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { CreatepatientComponent } from './components/createpatient/createpatient.component';
import { HomeComponent } from './components/home/home.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DoctorinfoComponent } from './components/doctorinfo/doctorinfo.component';
import { PatientinfoComponent } from './components/patientinfo/patientinfo.component';
import { CreatedoctorComponent } from './components/createdoctor/createdoctor.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    CreatepatientComponent,
    HomeComponent,
    DoctorinfoComponent,
    PatientinfoComponent,
    CreatedoctorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,ReactiveFormsModule,FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
