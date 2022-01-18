import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Doctor } from './doctor';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {
  
  constructor(private httpClient:HttpClient) { }
  readonly APIUrl="http://localhost:8080/api";
getdoctorlist(){
  return this.httpClient.get<Doctor[]>(this.APIUrl+'/v2/doctor');
}

}

