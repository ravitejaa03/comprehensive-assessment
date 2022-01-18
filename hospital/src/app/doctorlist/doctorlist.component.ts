import { Component, OnInit } from '@angular/core';
import { Doctor } from '../doctor';
import { DoctorService } from '../doctor.service';

@Component({
  selector: 'app-doctorlist',
  templateUrl: './doctorlist.component.html',
  styleUrls: ['./doctorlist.component.css']
})
export class DoctorlistComponent implements OnInit {
  

    doctors:Doctor[]=[];
    name:any;
  constructor(private doctorservice:DoctorService) { }

  ngOnInit(): void {
    this.doctorservice.getdoctorlist().subscribe((response)=>{
      this.doctors=response;
    }
    
    )};


    myEmp(event:any){
    alert("doctor:"+event.target.value) 
    }

    Search(){
      if(this.name==""){
        this.ngOnInit();
      }else{
        this.doctors=this.doctors.filter(res=>{
          return res.name.toLocaleLowerCase().match(this.name.toLocaleLowerCase());
        })
      }
    }}
