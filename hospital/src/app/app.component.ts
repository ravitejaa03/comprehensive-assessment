import { Component, OnInit} from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  implements OnInit{
  
  constructor(){}


  ngOnInit() {}
id:any="Patient"
tabchange(ids:string){
  this.id=ids;
  console.log(this.id);

}}






function ids(ids: any) {
  throw new Error('Function not implemented.');
}

