import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
//import { ActivatedRoute, Router } from '@angular/router';
import { Category } from '../category';
import { CategoryService } from '../category.service';

@Component({
  selector: 'app-add-category',
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.css']
})
export class AddCategoryComponent {
  category:Category = new Category(0," ");
  categoryList:any;
  message:any;
  constructor(private categoryService: CategoryService,private router:Router) { }

  addCategory() {
    console.log("buttonclick");
    console.log(this.category);
    let res=this.categoryService.addCategory(this.category).subscribe((data:any)=> {console.log ("added")});
    console.log(res);
    this.router.navigate(['/viewcategory']);
   }
  /*addCategory() {
    console.log("addController");
    this.categoryService.addCategory(this.category).subscribe
    ((data:any)=>{console.log("added Seccessfully"),
    this.getCategoryList();},
    error=>{console.log("Failed to Add category"),
    this.message = "Unable to add Category, Please Try Again"}
    )}*/
  }
  

