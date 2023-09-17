import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'; // Importa HttpClient

@Injectable({
  providedIn: 'root' // Esto asegura que el servicio esté disponible en toda la aplicación
})
export class DataService {

    private apiUrl = 'http://localhost:8080/api/activofijo'; // Define la URL del servicio


  constructor(private http: HttpClient) { }

  getactivofijo() {
    // Aquí puedes hacer una petición HTTP
    return this.http.get(this.apiUrl+'/getactivofijo'); 
  }

}