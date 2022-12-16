import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodControllerComponent } from './food-controller.component';

describe('FoodControllerComponent', () => {
  let component: FoodControllerComponent;
  let fixture: ComponentFixture<FoodControllerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FoodControllerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FoodControllerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
