import { Component, OnInit } from '@angular/core';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-caso-dos',
  templateUrl: './caso-dos.component.html',
  styleUrls: ['./caso-dos.component.css']
})

export class CasoDosComponent implements OnInit {
  datos : any; // Variable para almacenar los datos obtenidos del servicio

  constructor(private dataService: DataService) 
  {
    this.datos = [];
  }

   ngOnInit() {
    this.dataService.getactivofijo().subscribe((data: any) => {
      this.datos = data; // Almacena los datos obtenidos del servicio en la variable datos
    });
  }


}
