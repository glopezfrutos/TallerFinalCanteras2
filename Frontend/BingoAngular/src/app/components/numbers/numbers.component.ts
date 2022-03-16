import {Component, OnInit} from '@angular/core';
import {ApiService} from "../../services/api.service";
import {NumbersI} from "../../models/numbersI";

@Component({
  selector: 'app-numbers',
  templateUrl: './numbers.component.html',
  styleUrls: ['./numbers.component.css']
})
export class NumbersComponent implements OnInit {

  numbers: NumbersI[] = [];

  constructor(private api: ApiService) {
  }

  ngOnInit():
    void {
    this.api.getNumberList().subscribe(data => {
      console.log(data);
      this.numbers = data;
    })
  }
}
