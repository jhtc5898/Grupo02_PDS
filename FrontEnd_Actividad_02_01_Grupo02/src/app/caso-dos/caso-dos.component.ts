import { Component, OnInit } from '@angular/core';
import { DataService } from '../services/data.service';

interface Tipotemperatura {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-caso-dos',
  templateUrl: './caso-dos.component.html',
  styleUrls: ['./caso-dos.component.css']
})


export class CasoDosComponent {

  temperatura: any = '';
  tipo: any = '';
  piso: any = '';
  edificio: any = '';

  tiposTemperatura: Tipotemperatura[] = [
    { value: 'C', viewValue: 'Celsius' },
    { value: 'F', viewValue: 'Fahrenheit' }
  ];

  respuesta: any[] = [];

  constructor(private dataService: DataService) {}

  ok() {
    if (this.verificarFormulario()) {
      const data = {
        temperatura: this.temperatura,
        tipo: this.tipo,
        piso: this.piso,
        edificio: this.edificio,
      };
      
      console.log(data);

      this.dataService.postTemperatura(data).subscribe(response => {
        console.log(response);
        this.recargar();
      });
    } else {
      alert('Debe llenar todos los campos');
    }
  }

  verificarFormulario(): boolean {
    return this.temperatura !== '' && this.tipo !== '' && this.piso !== '' && this.edificio !== '';
  }

  recargar() {
    this.dataService.getListarTemperatura().subscribe((response: any[]) => {
      this.respuesta = response;
    });
  }
}