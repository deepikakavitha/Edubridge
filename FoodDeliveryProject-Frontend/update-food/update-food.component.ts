import { Component, OnInit } from '@angular/core';
import { Food } from '../food';
import { FoodService } from '../food.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-food',
  templateUrl: './update-food.component.html',
  styleUrls: ['./update-food.component.css']
})
export class UpdateFoodComponent implements OnInit{
 // food = new Food();
 food: Food = new Food(0," ",0,0,);
  foodList:any;
  message:any;
  foodId:number=0;
  constructor(private foodService: FoodService, private router:Router,private activatedRoute:ActivatedRoute) { }
  ngOnInit(): void {
    console.log("inside OnInit")
    this.foodId=this.activatedRoute.snapshot.params["foodId"];
    this.foodService.getFoodById(this.foodId).subscribe((data:any)=>{this.food=data,console.log("back to controller"+this.food)},
    error=>console.log(error),
    )
    
  }
  update() {
  console.log("UpdateFood");
  this.foodService.updateFood(this.foodId,this.food).subscribe
  ((data:any)=> {console.log(data),
   alert ("updated Successfully"),
   this.router.navigate(['/viewfood'])},
   error =>console.log("update Failed"),
  //this.message("Unable to Update Food. Try Again")
   )
}
}

