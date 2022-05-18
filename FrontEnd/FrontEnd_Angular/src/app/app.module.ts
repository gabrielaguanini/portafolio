import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { EncabezadoComponent } from './componentes/encabezado/encabezado.component';
import { AcercaDeComponent } from './componentes/acerca-de/acerca-de.component';
import { TrabajosComponent } from './componentes/trabajos/trabajos.component';
import { PieDePaginaComponent } from './componentes/pie-de-pagina/pie-de-pagina.component';
import { TrabajosDesarrolladoComponent } from './componentes/trabajos-desarrollado/trabajos-desarrollado.component';
import { HttpClientModule } from '@angular/common/http';

const routes: Routes = [
{path:'trabajos-desarrollado',component: TrabajosDesarrolladoComponent},
{path:'',component: AcercaDeComponent}


];

@NgModule({
  declarations: [
    AppComponent,
    EncabezadoComponent,
    AcercaDeComponent,
    TrabajosComponent,
    PieDePaginaComponent,
    TrabajosDesarrolladoComponent
    
  
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpClientModule   
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
