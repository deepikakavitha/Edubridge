import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';
import { Food } from '../food';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-food-controller',
  templateUrl: './food-controller.component.html',
  styleUrls: ['./food-controller.component.css']
})
export class FoodControllerComponent implements OnInit {
  // food = new Food();
  food: Food = new Food(0," ", 0, 0);
  foodList:any;
  categoryId:number=0;
  constructor(private foodService: FoodService, private activatedroute:ActivatedRoute,private router:Router) {}
  ngOnInit(): void {
    this.categoryId = this.activatedroute.snapshot.params["categoryId"];
    console.log("inside OnInit")
    let res = this.foodService.getAllFood();
   res.subscribe((data:any) => this.foodList = data );
   }

    public addFood() {
    console.log("buttonclick");
    console.log(this.food);
    let res=this.foodService.addFood(this.food,this.categoryId).subscribe((data:any)=> {console.log ("added")});
    console.log(res);
    this.router.navigate(['/viewfood']);
   }

}
