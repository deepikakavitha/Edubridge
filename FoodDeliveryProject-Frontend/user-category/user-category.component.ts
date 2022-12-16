import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Category } from '../category';
import { CategoryService } from '../category.service';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-user-category',
  templateUrl: './user-category.component.html',
  styleUrls: ['./user-category.component.css']
})
export class UserCategoryComponent implements OnInit {

  category: Category = new Category(0," ");
  categoryList:any;
  message:any;
  userEmailId:string="";
  constructor(private categoryService: CategoryService,private activateRoute:ActivatedRoute, private router: Router) { }
  ngOnInit(): void {
    console.log("inside OnInit")
    this.getCategoryList();
    this.userEmailId=this.activateRoute.snapshot.params["userEmailId"];
  }
  private getCategoryList() {
    let res = this.categoryService.getAllCategory();
    res.subscribe((data:any) => this.categoryList = data);
  }
  
viewFood(categoryId:number) {
this.router.navigate(['/userfood',categoryId,this.userEmailId])
}
back()
{
  this.router.navigate(['/userLogin'])
}
cart()
{
  this.router.navigate(['/cartdetails',this.userEmailId])
}
logOut()
{
  this.router.navigate(['/welcomePage'])
}

}

