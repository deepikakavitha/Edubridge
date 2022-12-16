import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Food } from '../food';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-view-food',
  templateUrl: './view-food.component.html',
  styleUrls: ['./view-food.component.css']
})
export class ViewFoodComponent implements OnInit {
   //food = new Food();
  food: Food = new Food(0,"", 0, 0,);
  foodList:any;
  message:any;
  constructor(private foodService: FoodService, private router:Router) { }
  ngOnInit(): void {
    console.log("inside OnInit")
    this.getFoodList();

  }
  private getFoodList() {
    let res = this.foodService.getAllFood();
    res.subscribe((data:any) => this.foodList = data);
  }
  //updateCategory(categoryId:number) {

  //}
deleteFood(foodId:number) {
console.log("deleteFood");
this.foodService.deleteFood(foodId).subscribe
((data:any)=>{console.log("deleted Seccessfully"),
this.getFoodList();},
error=>{console.log ("delete failed"),
this.message = "Unable to delete, Please Try Again"}
)}

updateFood(foodId:number) {
  console.log("UpdateFood");
  this.router.navigate(['/updateFood',foodId]);
}
/**updateFood(foodId:number) 
{
  this.router.navigate(['/updateFood',foodId]);
}**/
}
