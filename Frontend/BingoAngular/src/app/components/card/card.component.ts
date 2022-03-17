import { Component, OnInit } from '@angular/core';
import {ApiService} from "../../services/api.service";
import {CardDetailInterface} from "../../models/card-detail-interface";

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  cardNumbers: CardDetailInterface[] = [];

  constructor(private api: ApiService) { }

  ngOnInit(): void {
    this.api.getCardDetailList().subscribe(data => {
      console.log(data);
      this.cardNumbers = data;
    })
  }

}
