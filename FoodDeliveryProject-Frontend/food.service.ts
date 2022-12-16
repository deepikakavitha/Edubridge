import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Food } from './food';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class FoodService {

  constructor(private http: HttpClient) {

   }
   //private url = "http://localhost:8089/api/food";

   public addFood(food:Food, categoryId:number): Observable<any>{
    console.log("service");
    console.log(food);
     return this.http.post<any>("http://localhost:8089/api/food/add/"+categoryId,food,{responseType:'Text' as 'json'});
   }
   public getAllFood(){
    console.log("inside Food Service");
    return this.http.get("http://localhost:8089/api/food");
   }
   
   public deleteFood(foodId:number) {
    console.log("inside Food Service");
    return this.http.delete<any>("http://localhost:8089/api/food/"+foodId,{responseType:'Text' as 'json'} );
   }
   
   public updateFood(foodId:number, food:Food) {
     console.log("inside update food Service");
     return this.http.put<any>("http://localhost:8089/api/food/"+foodId,food,{responseType:'Text' as 'json'} );
   }
   public getFoodById(foodId:number) {
    console.log("get Foot By Id Service");
    return this.http.get("http://localhost:8089/api/food/"+foodId);
   }
   public getFoodByCategoryId(categoryId:number) {
    console.log("get Food By CategoryId Service");
    return this.http.get("http://localhost:8089/api/food/user/"+categoryId);
   }
}
