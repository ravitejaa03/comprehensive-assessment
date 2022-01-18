import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Patient } from './patient';

@Injectable({
  providedIn: 'root'
})
export class PatientService {

 
  

  constructor(private http:HttpClient) { }
  url:string="http://localhost:8080/api/v1/patient";
 getpatientlist(){
   return this.http.get<Patient[]>(this.url);
 }
 
}



