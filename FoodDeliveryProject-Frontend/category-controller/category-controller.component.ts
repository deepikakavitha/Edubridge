import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../category.service';
import { Category } from '../category';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-controller',
  templateUrl: './category-controller.component.html',
  styleUrls: ['./category-controller.component.css']
})
export class CategoryControllerComponent implements OnInit{

  category: Category = new Category(0,"");
  categoryList:any;

  constructor(private categoryService: CategoryService,private router:Router) {}
  ngOnInit(): void {
    console.log("inside OnInit")
    let res = this.categoryService.getAllCategory();
   res.subscribe((data:any) => this.categoryList = data );
   }

    public addCategory() {
    console.log("buttonclick");
    console.log(this.category);
    let res=this.categoryService.addCategory(this.category).subscribe((data:any)=> {console.log ("registered")});
    console.log(res);
    this.router.navigate(['/viewcategory']);
   }

}
