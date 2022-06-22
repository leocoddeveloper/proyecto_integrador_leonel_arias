import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../model/persona.model';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  apiURL = ' http://localhost:8080/personas/traer'; 
  constructor(private http: HttpClient) { }

  public getPersona(): Observable<any>{
    return this.http.get<any>(this.apiURL);
  }
}
