import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent {
 user = new User("","","","","","","","","","");
 userList:any;
  message = ""
  userEmailId:string="";
  constructor(private userService: UserService, private route: Router) { }

  ngOnInit(): void {
    
  }
userLogin() 
  {
    this.userService.userLoginService(this.user).subscribe 
    (
      data => {console.log("Login Success",this.userEmailId=this.user.emailId),
      this.route.navigate(['/usercategory',this.userEmailId]) 
    },
    error => {console.log("Login Failed"), console.log(error),
    this.message="login failed.enter valid email and password"
  }
  )
}
back()
{
  this.route.navigate(['/welcomePage'])
}

}
/*admin = new Admin(0, "", "", "","");
  adminList:any;
  message = ""
  constructor(private adminService: AdminService, private router: Router) { }

  ngOnInit(): void {
    
  }
  adminLogin() 
  {
    this.adminService.adminLoginService(this.admin).subscribe 
    (
      data => {console.log("Login Success"),
      this.router.navigate(['\adminhome'])
    },
    error => {console.log("Login Failed"), console.log(error),
    this.message="login failed.enter valid email and password"
  }
    )
  }
  back()
  {
    this.router.navigate(['/welcomepage'])
  }

}

}*/
