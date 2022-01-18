export class Doctor{
     id: number;
     name:string;
     age:number;
     gender:string;
     specialistfield: string;
     noofpatientsattended: number;
    
     constructor(id: number,name: string,age: number,gender: string,specialistfield: string,noofpatientsattended: number){
         this.id=id;
         this.name=name;
         this.age=age;
         this.gender=gender;
         this.specialistfield=specialistfield;
         this.noofpatientsattended=noofpatientsattended;
     }


}