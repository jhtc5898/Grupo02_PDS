import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CasoUnoComponent } from './caso-uno/caso-uno.component';
import { CasoDosComponent } from './caso-dos/caso-dos.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'casouno', component: CasoUnoComponent },
  { path: 'casodos', component: CasoDosComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
