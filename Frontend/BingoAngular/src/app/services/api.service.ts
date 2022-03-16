import {Injectable} from '@angular/core';
import {NumbersI} from "../models/numbersI";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private url: string;
  constructor(private http: HttpClient) {
    this.url = 'http://localhost:8080/';
  }

  getNumberList(): Observable<NumbersI[]> {
    return this.http.get<NumbersI[]>(this.url + 'numbers');
  }
}
