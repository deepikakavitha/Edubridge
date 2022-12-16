import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { User } from './user';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) {

   }
   public registerUser(user:User): Observable<any>{
    console.log("service");
    console.log(user);
     return this.http.post<any>("http://localhost:8089/api/user/register", user,{responseType:'Text' as 'json'});
   }
   public userLoginService(user:User):Observable<any>
   {
     return this.http.post<any>("http://localhost:8089/api/user/login",user,{responseType:'Text' as 'json'});
   }
   public getAllUser(){
    console.log("inside User Service");
    return this.http.get("http://localhost:8089/api/user");
   }
}
 