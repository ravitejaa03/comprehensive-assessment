import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PatientlistComponent } from './patientlist/patientlist.component';
import { DoctorlistComponent } from './doctorlist/doctorlist.component';
const routes: Routes = [{path:'v1/patient',component:PatientlistComponent},
{path:'v2/doctor',component:DoctorlistComponent},];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
  
})
export class AppRoutingModule { }
export const routingComponent=[PatientlistComponent,DoctorlistComponent]
