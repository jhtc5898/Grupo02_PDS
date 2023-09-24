import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'; // Importa HttpClient

@Injectable({
  providedIn: 'root' // Esto asegura que el servicio esté disponible en toda la aplicación
})
export class DataService {

  private apiUrl = 'http://localhost:8080/escenario01/AgregarComponente'; // Define la URL del servicio
  private apiUrl1 = 'http://localhost:8080/escenario01/ListarArchivos'; // Define la URL del servicio
  private apiUrlCaso1 = 'http://localhost:8080/escenario02/temperatura'; // Define la URL del servicio
  private apiUrlCaso1get = 'http://localhost:8080/escenario02/listar'; // Define la URL del servicio


  constructor(private http: HttpClient) { }

  postComponentes(componete: any) {
    // Aquí puedes hacer una petición HTTP
    return this.http.post(this.apiUrl, componete);
  }

  getComponentes(): any {
    // Aquí puedes hacer una petición HTTP
    return this.http.get(this.apiUrl1);
  }

  postTemperatura(temperatura: any) {
    // Aquí puedes hacer una petición HTTP
    return this.http.post(this.apiUrlCaso1, temperatura);
  }
  getListarTemperatura(): any {
    // Aquí puedes hacer una petición HTTP
    return this.http.get(this.apiUrlCaso1get);
  }

}