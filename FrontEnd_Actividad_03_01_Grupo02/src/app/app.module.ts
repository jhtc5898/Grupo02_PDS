import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CasoUnoComponent } from './caso-uno/caso-uno.component';
import { CasoDosComponent } from './caso-dos/caso-dos.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CasoUnoComponent,
    CasoDosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
