import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddPfeComponent } from './add-pfe/add-pfe.component';
import { AddTypeComponent } from './add-type/add-type.component';
import { PfesComponent } from './pfes/pfes.component';
import { TypesComponent } from './types/types.component';

const routes: Routes = [
  { path: "", component: PfesComponent },
  { path: "addpfe", component: AddPfeComponent },
  { path: "addtype", component: AddTypeComponent },
  { path: "types", component: TypesComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
