import { Component } from '@angular/core';
import { DataService } from '../services/data.service';

interface Tipo{
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

  nombre: any = '';
  tamanio: any = '';
  ubicacion: any = '';
  tipo: any = '';

  tiposDato: Tipo[] = [
    { value: 'DOCX', viewValue: 'DOCX' },
    { value: 'PDF', viewValue: 'PDF' },
    { value: 'XLSX', viewValue: 'XLSX' },
    { value: 'CARPETA', viewValue: 'CARPETA' },
  ];

  arbol: any = [];

  verificar(): boolean {
    let validateForm: boolean = false;
    if (this.nombre != '' && this.tamanio != '' && this.ubicacion != '' && this.tipo != '') 
    {
      validateForm = true;
    }
    return validateForm;
  }

  ok() {

    if (this.verificar()) {
      const data = {
        nombre: this.nombre,
        tamanio: this.tamanio,
        ubicacion: this.ubicacion,
        tipo: this.tipo
      }
      this.service.postComponentes(data).subscribe(response => {
        console.log(response);
        this.recargar();
      });
    } else {
      alert('Debe llenar todos los campos');
    }

  }
  recargar() {
    this.service.getComponentes().subscribe((response: any[]) => {
      this.arbol = response;
    });
  }

}
