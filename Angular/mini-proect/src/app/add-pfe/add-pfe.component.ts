import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceManager } from '../manager.service';
import { Pfe } from '../pfe';
import { Type } from '../type';

@Component({
  selector: 'app-add-pfe',
  templateUrl: './add-pfe.component.html',
  styleUrls: ['./add-pfe.component.css']
})
export class AddPfeComponent implements OnInit {
  types: any ;
  title: string = '';
  type: any ;
  constructor(private ser:ServiceManager, private route:Router) { }

  ngOnInit(): void {
    this.getPfetypes();
  }
  gotoList() {
    this.route.navigate(['/']);
  }
  getPfetypes() {
    this.ser.getAllType().subscribe(
      (data) => {
        this.types = data;
       
      },
      (err) => { console.log(err) }
    )
  }
  save() {
    this.ser.postPfe({
      "id": null,
      "title": this.title,
      "type": this.type,
  }).subscribe(
    data=>{this.route.navigate(["/liste"])},
    err=>{
      console.log(JSON.toString())
      console.log(this.title)
      console.log(this.type)
    }
  )
  }
}
