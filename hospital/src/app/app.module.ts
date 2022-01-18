import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http'
import { PatientService } from './patient.service';
import { PatientlistComponent } from './patientlist/patientlist.component';
import { DoctorlistComponent } from './doctorlist/doctorlist.component';
import { DoctorService } from './doctor.service';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    PatientlistComponent,
    DoctorlistComponent,
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    Ng2SearchPipeModule,
    FormsModule
  ],
  providers: [PatientService,DoctorService],
  bootstrap: [AppComponent]
})
export class AppModule { }
