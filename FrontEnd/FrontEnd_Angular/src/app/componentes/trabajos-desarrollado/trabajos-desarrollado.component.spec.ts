import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrabajosDesarrolladoComponent } from './trabajos-desarrollado.component';

describe('TrabajosDesarrolladoComponent', () => {
  let component: TrabajosDesarrolladoComponent;
  let fixture: ComponentFixture<TrabajosDesarrolladoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrabajosDesarrolladoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TrabajosDesarrolladoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
