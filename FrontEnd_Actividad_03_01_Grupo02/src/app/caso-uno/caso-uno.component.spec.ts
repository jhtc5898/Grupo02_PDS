import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CasoUnoComponent } from './caso-uno.component';

describe('CasoUnoComponent', () => {
  let component: CasoUnoComponent;
  let fixture: ComponentFixture<CasoUnoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CasoUnoComponent]
    });
    fixture = TestBed.createComponent(CasoUnoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
