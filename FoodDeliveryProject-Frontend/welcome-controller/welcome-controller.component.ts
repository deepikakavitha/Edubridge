import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome-controller',
  templateUrl: './welcome-controller.component.html',
  styleUrls: ['./welcome-controller.component.css']
})
export class WelcomeControllerComponent implements OnInit {

  constructor(private route :Router) { }

  ngOnInit(): void {
  }
  userLogin()
{
  this.route.navigate(['/userLogin'])
}
adminLogin()
{
  this.route.navigate(['/adminLogin'])
}

}
