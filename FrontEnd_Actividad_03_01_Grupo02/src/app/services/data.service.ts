import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  private apiUrl1 = 'http://localhost:8080/interpreter/evaluarFecha'; // Define la URL del servicio
  private apiUrl2 = 'http://localhost:8080/interpreter/evaluarGeneral'; // Define la URL del servicio

  private apiUrlMsg1 = 'http://localhost:8080/mediator/sendmessage';
  private apiUrlMsg2 = 'http://localhost:8080/mediator/chatlist';

  constructor(private http: HttpClient) { }

  evaluarFecha(param: any) {
    // Aquí puedes hacer una petición HTTP
    return this.http.get(this.apiUrl1 + "?expresionEvaluar=" + param);
  }

  evaluarGeneral(param: any) {
    // Aquí puedes hacer una petición HTTP
    return this.http.get(this.apiUrl2 + "?expresionEvaluar=" + param);
  }

  enviarMsg(data: any) {
    return this.http.post(this.apiUrlMsg1, data);
  }
  verMsg() {
    return this.http.get(this.apiUrlMsg2);
  }
}
