import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderControllerComponent } from './order-controller.component';

describe('OrderControllerComponent', () => {
  let component: OrderControllerComponent;
  let fixture: ComponentFixture<OrderControllerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OrderControllerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OrderControllerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
