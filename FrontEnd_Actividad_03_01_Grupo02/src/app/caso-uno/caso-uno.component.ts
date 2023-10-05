import { Component } from '@angular/core';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-caso-uno',
  templateUrl: './caso-uno.component.html',
  styleUrls: ['./caso-uno.component.css']
})
export class CasoUnoComponent {

  constructor(private service: DataService) { }

  chatjuan: any = '';
  chatpedro: any = '';

  msg: any = [];



  verMsg() {
    this.service.verMsg().subscribe({
      next: response => {
        this.msg = response;
        this.clearChat();
      }, error: err => {
        console.log(err);

      }
    });
  }

  msgJuan() {
    const chatOrigen = 'Juan';
    const chatDestino = 'Pedro';
    const msg = this.chatjuan;
    if (msg) {
      const data = {
        userNameFrom: chatOrigen,
        userNameTo: chatDestino,
        message: msg
      }
      this.service.enviarMsg(data).subscribe({
        next: response => {
          console.log(response);

        },
        error: err => {
          console.log(err);
        }
      });
      setTimeout(() => {
        this.verMsg()
      }, 500);
    } else {
      alert('no hay texto para enviar');
    }
  }

  msgPedro() {
    const chatOrigen = 'Pedro';
    const chatDestino = 'Juan';
    const msg = this.chatpedro;
    if (msg) {
      const data = {
        userNameFrom: chatOrigen,
        userNameTo: chatDestino,
        message: msg
      }
      this.service.enviarMsg(data).subscribe({
        next: response => {
          console.log(response);
        },
        error: err => {
          console.log(err);
        }
      });
      setTimeout(() => {
        this.verMsg()
      }, 500);

    } else {
      alert('no hay texto para enviar');
    }
  }
  clearChat() {
    this.chatjuan = '';
    this.chatpedro = '';
  }
}
