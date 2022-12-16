import { Component, OnInit } from '@angular/core';
//import { Order } from '../order-controller/order';
import { OrderService } from '../order.service';
//import { Order } from './order';
import { Order } from '../order';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-order-controller',
  templateUrl: './order-controller.component.html',
  styleUrls: ['./order-controller.component.css']
})
export class OrderControllerComponent implements OnInit{

  order: Order = new Order(0, 0);
  orderList:any;
  userEmailId:String=" ";
  constructor(private orderService: OrderService,private activatedRoute:ActivatedRoute) {}
  ngOnInit(): void {
    console.log("inside OnInit")
    this.userEmailId=this.activatedRoute.snapshot.params["userEmailId"];
    this.addOrder();
    let res = this.orderService.getAllOrder();
   res.subscribe((data:any) => this.orderList = data );
   }

    public addOrder() {
    console.log("buttonclick");
    //console.log(this.order);
    let res=this.orderService.addOrder(this.order,this.userEmailId).subscribe((data:any)=> {console.log ("added")});
    console.log(res);
   }


}
