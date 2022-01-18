import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
@Component({
  selector: 'app-patientlist',
  templateUrl: './patientlist.component.html',
  styleUrls: ['./patientlist.component.css']
})
export class PatientlistComponent implements OnInit {
  

    patients:Patient[]=[];
  id: any;
    
  
  constructor( private patientservice:PatientService) { }

  ngOnInit(): void{

this.patientservice.getpatientlist().subscribe((response)=>{
  this.patients=response;
}

)

  }
  Search(){
    if(this.id==""){
      this.ngOnInit();
    }else{
      this.patients=this.patients.filter(res=>{
        return res.id.toLocaleString().match(this.id.toLocaleString());
      })
    }
  }
}
