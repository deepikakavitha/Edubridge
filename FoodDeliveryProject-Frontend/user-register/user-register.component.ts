import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
import { User } from '../user';

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent {

  user: User = new User("","","","","","","","","","");
  userList:any;

  constructor(private userService: UserService,private route :Router) {}
 /* ngOnInit(): void {
    console.log("inside OnInit")
    let res = this.userService.getAllUser();
   res.subscribe((data:any) => this.userList = data );
   }*/

   ngOnInit(): void {
   }
    public registerUser() {
    console.log("buttonclick");
    console.log(this.user);
    let res=this.userService.registerUser(this.user).subscribe((data:any)=> {console.log ("registered")});
    console.log(res);
    this.route.navigate(['/userCategory'])
   }

}
