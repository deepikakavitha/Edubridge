import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CartControllerComponent } from './cart-controller.component';

describe('CartControllerComponent', () => {
  let component: CartControllerComponent;
  let fixture: ComponentFixture<CartControllerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CartControllerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CartControllerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
