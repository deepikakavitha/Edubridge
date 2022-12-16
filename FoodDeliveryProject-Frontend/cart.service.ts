import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Cart } from './cart';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CartService {

  constructor(private http: HttpClient) {

   }
   private url = "http://localhost:8089/api/cart";

   public addCart(cart:Cart, foodId:number,userEmailId:string): Observable<any>{
    console.log("service");
    console.log(cart);
     return this.http.post<any>("http://localhost:8089/api/cart/add/"+foodId+"/"+userEmailId,cart,{responseType:'Text' as 'json'});
   }
   
   public getAllCartByUserEmailId(userEmailId:string){
    console.log("inside Cart Service");
    return this.http.get("http://localhost:8089/api/cart/user/"+userEmailId);
   }

   public delete(cartId:number) {
    console.log("inside Cart Service");
    return this.http.delete("http://localhost:8089/api/cart/"+cartId,{responseType:'Text' as 'json'} );
   }
}
 