import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceManager } from '../manager.service';

@Component({
  selector: 'app-pfes',
  templateUrl: './pfes.component.html',
  styleUrls: ['./pfes.component.css']
})
export class PfesComponent implements OnInit {

  pfes: any = [];
  length: number = 0;
  types: any = [];
  search_term: string = '';


  constructor(private ser:ServiceManager, private route:Router) { }

  ngOnInit(): void {
    this.ser.getAllPfe().subscribe(
      data => {
        this.pfes = data;
        this.length = this.pfes.length;
      },
      err=>{ }
    )

    this.ser.getAllType().subscribe(
      data => {
        this.types = data;
        console.log(data);
      },
      err=>{ }
    )
  }

  getAll() {
    this.ser.getAllPfe().subscribe(
      data => {
        this.pfes = data;
        
      },
      err=>{ }
    )
  }

  getByCat(id: number) {
    this.ser.getPfeByCategory(id).subscribe(
      data => { this.pfes = data; },
      err => { }
    )
  }

  search() {
    if (this.search_term === '') {
      this.getAll()
    } else {
      this.ser.getPfeByTitle(this.search_term).subscribe(
        data => { this.pfes = data; },
        err => { }
      )
    }
    
  }

  supp(id: number) {
    this.ser.deletePfe(id).subscribe(
      data => { this.ngOnInit() },
      err => { }
    )
  }

  addpfe() {
    this.route.navigate(["/addpfe"])
  }



}
