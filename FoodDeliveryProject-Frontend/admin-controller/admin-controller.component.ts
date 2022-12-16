import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Admin } from '../admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-admin-controller',
  //templateUrl: './admin-controller.component.html',
  templateUrl: './admin-controller.component.html',
  styleUrls: ['./admin-controller.component.css']
})
export class AdminControllerComponent implements OnInit{
  admin = new Admin(0, "", "", "","");
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
    this.router.navigate(['/welcomePage'])
  }

}
