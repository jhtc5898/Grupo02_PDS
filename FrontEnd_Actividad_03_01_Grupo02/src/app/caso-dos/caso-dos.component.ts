import { Component } from '@angular/core';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-caso-dos',
  templateUrl: './caso-dos.component.html',
  styleUrls: ['./caso-dos.component.css']
})
export class CasoDosComponent {
  romanNumber1 = '';
  respuesta1 = '';
  romanNumber2 = '';
  respuesta2 = '';


  constructor(private dataService : DataService) { 

  }

  fechaInterpreter()
  {
    if (this.romanNumber1 == '' || this.romanNumber1 == null)
    {
      alert("Ingrese los dos numeros romanos");
      return;
    }

    this.dataService.evaluarFecha(this.romanNumber1).subscribe((data: any) => {
      this.respuesta1 = data.data;
    });
  }

  generalInterpreter()
  {
    if (this.romanNumber2 == '' || this.romanNumber2  == null)
    {
      alert("Ingrese los dos numeros romanos");
      return;
    }
    this.dataService.evaluarGeneral(this.romanNumber2).subscribe((data: any) => {
      this.respuesta2 = data;
    });
  }

}
