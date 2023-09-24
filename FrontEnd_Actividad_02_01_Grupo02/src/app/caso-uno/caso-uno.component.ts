import { Component } from '@angular/core';
import { DataService } from '../services/data.service';

interface TipoVehiculo {
  value: string;
  viewValue: string;
}

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
  tipo: any = '';

  tiposVehiculo: TipoVehiculo[] = [
    { value: 'AUTO', viewValue: 'Auto' },
    { value: 'CAMIONETA', viewValue: 'Camioneta' },
    { value: 'CAMION', viewValue: 'Camion' },
  ];

  vehiculos: any = [];

  verificar(): boolean {
    let validateForm: boolean = false;
    if (this.placa != '' && this.color != '' && this.anio != '' && this.marca != '' && this.modelo != '' && this.tipo != '') {
      validateForm = true;
    }
    return validateForm;
  }

  ok() {

    if (this.verificar()) {
      const data = {
        placa: this.placa,
        color: this.color,
        anio: this.anio,
        marca: this.marca,
        modelo: this.modelo,
        tipo: this.tipo
      }
      /* this.service.postVehiculo(data).subscribe(response => {
        this.recargar();
      }); */
    } else {
      alert('Debe llenar todos los campos');
    }

  }
  recargar() {
    /* this.service.getVehiculo().subscribe(response => {
      this.vehiculos = response;
    }); */
  }

}
