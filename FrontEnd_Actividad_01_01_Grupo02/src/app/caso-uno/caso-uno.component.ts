import { Component } from '@angular/core';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-caso-uno',
  templateUrl: './caso-uno.component.html',
  styleUrls: ['./caso-uno.component.css']
})
export class CasoUnoComponent {

  constructor(private service: DataService) { }

  placa: any = '';
  color: any = '';
  anio: any = '';
  marca: any = '';
  modelo: any = '';

  vehiculos: any = [{ placa: 'placa asd', color:'amarillo'}];

  ok() {
    console.log(this.placa);
  }
  recargar() {
    
  }

}
