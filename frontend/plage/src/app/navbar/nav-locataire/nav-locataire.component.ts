import { Component } from '@angular/core';

@Component({
  selector: 'app-nav-locataire',
  templateUrl: './nav-locataire.component.html',
  styleUrls: ['./nav-locataire.component.css']
})
export class NavLocataireComponent {

  deconnection() {
    sessionStorage.removeItem("idLoc");
    sessionStorage.setItem("message","Deconnexion de l'espace locataire réussi !");
    window.location.reload();
  }
}
