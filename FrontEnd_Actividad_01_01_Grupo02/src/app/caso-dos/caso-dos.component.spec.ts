import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CasoDosComponent } from './caso-dos.component';

describe('CasoDosComponent', () => {
  let component: CasoDosComponent;
  let fixture: ComponentFixture<CasoDosComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CasoDosComponent]
    });
    fixture = TestBed.createComponent(CasoDosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
