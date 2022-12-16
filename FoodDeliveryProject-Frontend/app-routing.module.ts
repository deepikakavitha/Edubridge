import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserRegisterComponent } from './user-register/user-register.component';
import { CategoryControllerComponent } from './category-controller/category-controller.component';
import { FoodControllerComponent } from './food-controller/food-controller.component';
import { CartControllerComponent } from './cart-controller/cart-controller.component';
import { OrderControllerComponent } from './order-controller/order-controller.component';
import { AdminControllerComponent } from './admin-controller/admin-controller.component';
import { WelcomeControllerComponent } from './welcome-controller/welcome-controller.component';
import { ViewCategoryComponent } from './view-category/view-category.component';
import { ViewFoodComponent } from './view-food/view-food.component';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { AddCategoryComponent } from './add-category/add-category.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { UserLoginComponent } from './user-login/user-login.component';
import {UserCategoryComponent} from './user-category/user-category.component';
import { UpdateFoodComponent } from './update-food/update-food.component';
import { UserFoodComponent } from './user-food/user-food.component';
import{CartDetailsComponent} from './cart-details/cart-details.component'
const routes: Routes = [ {path:"", component:WelcomeControllerComponent},
  
{path:"registerUser", component:UserRegisterComponent},
{path:"add", component:CategoryControllerComponent},
{path: "viewcategory", component:ViewCategoryComponent},
{path: "viewfood", component:ViewFoodComponent},
{path: "userfood/:categoryId/:userEmailId", component:UserFoodComponent},
{path: "usercategory/:userEmailId", component:UserCategoryComponent},
{path: "addCategory", component:AddCategoryComponent},
{ path: 'register', component: AdminControllerComponent},
{ path: 'adminLogin', component: AdminControllerComponent},
{ path: 'userLogin', component: UserLoginComponent},
{ path: 'adminhome', component: AdminHomeComponent},
{path: 'userDetails', component:UserDetailsComponent},
{path: 'welcomePage', component:WelcomeControllerComponent},
{path: 'foodController/:categoryId', component:FoodControllerComponent},
{path: 'cartController/:foodId/:userEmailId', component:CartControllerComponent},
{path:'cartdetails/:userEmailId',component:CartDetailsComponent},
{path: 'updateFood/:foodId',component:UpdateFoodComponent},
{path: 'addToCart/:foodId',component:CartControllerComponent},
{path: 'orderItems/:userEmailId',component:OrderControllerComponent},
{path:'removeFromCart/:cartId',component:CartDetailsComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
