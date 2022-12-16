import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
//import { UserRegisterComponent } from './user-register/user-register.component';
import { UserService } from './user.service';
import { CategoryControllerComponent } from './category-controller/category-controller.component';
import { CategoryService } from './category.service';
import { FoodControllerComponent } from './food-controller/food-controller.component';
import { AddCategoryComponent } from './add-category/add-category.component';
import { UserRegisterComponent } from './user-register/user-register.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { AdminControllerComponent } from './admin-controller/admin-controller.component';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { WelcomeControllerComponent } from './welcome-controller/welcome-controller.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { ViewCategoryComponent } from './view-category/view-category.component';
import { UserCategoryComponent } from './user-category/user-category.component';
import { ViewFoodComponent } from './view-food/view-food.component';
import { UpdateFoodComponent } from './update-food/update-food.component';
import { UserFoodComponent } from './user-food/user-food.component';
import { CartControllerComponent } from './cart-controller/cart-controller.component';
import { OrderControllerComponent } from './order-controller/order-controller.component';
import { CartDetailsComponent } from './cart-details/cart-details.component';
 //import { UserCategoryComponent } from './user-category/user-category.component';

@NgModule({
  declarations: [
    AppComponent,
    UserRegisterComponent,
    CategoryControllerComponent,
    FoodControllerComponent,
    AddCategoryComponent,
    UserCategoryComponent,
    UserLoginComponent,
    AdminControllerComponent,
    AdminHomeComponent,
    WelcomeControllerComponent,
    UserDetailsComponent,
    ViewCategoryComponent,
    ViewFoodComponent,
    ViewCategoryComponent,
    UpdateFoodComponent,
    UserFoodComponent,
    CartControllerComponent,
    OrderControllerComponent,
    CartDetailsComponent,
   // UserControllerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
