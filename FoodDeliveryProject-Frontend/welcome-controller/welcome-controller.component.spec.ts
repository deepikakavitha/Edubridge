import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WelcomeControllerComponent } from './welcome-controller.component';

describe('WelcomeControllerComponent', () => {
  let component: WelcomeControllerComponent;
  let fixture: ComponentFixture<WelcomeControllerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WelcomeControllerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WelcomeControllerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
