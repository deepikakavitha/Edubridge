import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Category } from './category';
//import { Category } from './category-controller/category';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private http: HttpClient) {
    
   }
   private url = "http://localhost:8089/api/category";

   public addCategory(category:Category): Observable<any>{
    console.log("service");
    console.log(Category);
     return this.http.post<any>("http://localhost:8089/api/category/add", category,{responseType:'text' as 'json'});
   }

   public getAllCategory(){
    console.log("inside category Service");
    return this.http.get(`${this.url}`);
   }

public deleteCategory(categoryId:number):Observable <any>
 {
  console.log("delete Service");
  console.log(categoryId);
  return this.http.delete(`${this.url}/${categoryId}`);
}
public getCategory(categoryId:number):Observable <any>
 {
  console.log("category Service");
  console.log(categoryId);
  return this.http.get(`${this.url}/${categoryId}`);
}
public getFood(categoryId:number):Observable <any>
{
 console.log("category Service");
 console.log(categoryId);
 return this.http.get(`${this.url}/${categoryId}`);
}
/*public addCategory(categoryId:number):Observable<any>
 {
  console.log("add Service");
  console.log(categoryId);
  return this.http.post(`${this.url}/${categoryId}`);
}*/
}