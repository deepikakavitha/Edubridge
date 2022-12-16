import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from '../category';
import { CategoryService } from '../category.service';

@Component({
  selector: 'app-view-category',
  templateUrl: './view-category.component.html',
  styleUrls: ['./view-category.component.css']
})
export class ViewCategoryComponent implements OnInit {

  category: Category = new Category(0," ");
  categoryList:any;
  message:any;
  constructor(private categoryService: CategoryService, private router: Router) { }
  ngOnInit(): void {
    console.log("inside OnInit")
    this.getCategoryList();

  }
  private getCategoryList() {
    let res = this.categoryService.getAllCategory();
    res.subscribe((data:any) => this.categoryList = data);
  }
  //updateCategory(categoryId:number) {

  //}
deleteCategory(categoryId:number) {
console.log("deleteController");
this.categoryService.deleteCategory(categoryId).subscribe
((data:any)=>{console.log("deleted Seccessfully"),
this.getCategoryList();},
error=>{console.log ("delete failed"),
this.message = "Unable to delete, Please Try Again"}
)}

addFood(categoryId:number) {
  console.log("Add Food To food category");
  this.router.navigate(['/foodController',categoryId]);
}

}

