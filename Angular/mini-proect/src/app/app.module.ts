import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PfesComponent } from './pfes/pfes.component';
import { TypesComponent } from './types/types.component';
import { AddPfeComponent } from './add-pfe/add-pfe.component';
import { AddTypeComponent } from './add-type/add-type.component';
import { ServiceManager } from './manager.service';
import { HttpClientModule } from '@angular/common/http';
import {FormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    PfesComponent,
    TypesComponent,
    AddPfeComponent,
    AddTypeComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule, 
    FormsModule,
  ],
  providers: [ServiceManager],
  bootstrap: [AppComponent]
})
export class AppModule { }
