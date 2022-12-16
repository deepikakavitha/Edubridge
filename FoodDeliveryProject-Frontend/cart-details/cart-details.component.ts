import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';
import { Cart } from '../cart';
import {Order} from '../order';
import {OrderService} from '../order.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-cart-details',
  templateUrl: './cart-details.component.html',
  styleUrls: ['./cart-details.component.css']
})
export class CartDetailsComponent implements OnInit{
  cart: Cart = new Cart (0,0,0);
 // cart1:Cart =new Cart(0,0,0);
  cartList:any;
  message:any;
  order: Order = new Order(0, 0);
  orderList:any;
  userEmailId:string="";
   constructor(private cartService: CartService, private router:Router,private activatedRoute:ActivatedRoute,private orderService:OrderService) {}
   ngOnInit(): void {
    this.userEmailId = this.activatedRoute.snapshot.params["userEmailId"];
    console.log("inside OnInit")
    this.getCartListByEmailId();

  }
  private getCartListByEmailId() {
    let res = this.cartService.getAllCartByUserEmailId(this.userEmailId);
    res.subscribe((data:any) =>{console.log(data), this.cartList = data},
    error=>{console.log(error)}
    );
  }
   
  removeFromCart(cartId:number) {
      console.log("deleteFood");
      this.cartService.delete(cartId).subscribe
      ((data:any)=>{console.log("deleted Seccessfully"),
      this.getCartListByEmailId();},
      error=>{console.log ("delete failed"),
      this.message = "Unable to delete, Please Try Again"}
      )}

      addMoreItem()
       {
        this.router.navigate(['/usercategory',this.userEmailId]);
       }
       OrderItems()
       {
        this.router.navigate(['/orderItems',this.userEmailId]);
       }
}
