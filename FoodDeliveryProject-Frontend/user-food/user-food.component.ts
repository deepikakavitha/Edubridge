import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Food } from '../food';
import { FoodService } from '../food.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-user-food',
  templateUrl: './user-food.component.html',
  styleUrls: ['./user-food.component.css']
})
export class UserFoodComponent implements OnInit {
 /**  food: Food = new Food(0,"", 0, 0);
  foodList:any;
  message:any;
  constructor(private foodService: FoodService, private router:Router) { }
  ngOnInit(): void {
    console.log("inside OnInit")
    this.getFoodByCategory(categoryId);

  }*/

  food: Food = new Food(0," ", 0, 0);
  foodList:any;
  categoryId:number=0;
  userEmailId:string="";
  constructor(private foodService: FoodService, private activatedRoute:ActivatedRoute,private router:Router) {}
  ngOnInit(): void {
    this.categoryId = this.activatedRoute.snapshot.params["categoryId"];
    this.userEmailId = this.activatedRoute.snapshot.params["userEmailId"];
    console.log("inside OnInit")
    let res = this.foodService.getFoodByCategoryId(this.categoryId);
   res.subscribe((data:any) => this.foodList = data );
   }
   
   public addToCart(foodName:string) {
     this.router.navigate(['/cartController',foodName,this.userEmailId])
   } 
}
/**private getFoodByCategory(categoryId:number) {
    console.log("FoodController");
this.foodService.getFoodByCategoryId(categoryId).subscribe
((data:any)=>{console.log("Food"),
this.foodList();},)
  }*/