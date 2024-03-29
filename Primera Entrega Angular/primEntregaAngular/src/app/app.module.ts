import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HeaderComponent } from './components/header/header.component';
import { MainComponent } from './components/main/main.component';
import { FormProveedorComponent } from './components/proveedor/form-proveedor/form-proveedor.component';
import { FormProductoComponent } from './components/producto/form-producto/form-producto.component';
import { FormOcComponent } from './components/oc/form-oc/form-oc.component';
import { TarjProveedorComponent } from './components/proveedor/tarj-proveedor/tarj-proveedor.component';
import { TarjProductoComponent } from './components/producto/tarj-producto/tarj-producto.component';
import { TarjOcComponent } from './components/oc/tarj-oc/tarj-oc.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { DetalleComponent } from './components/detalle/detalle.component';
import { DetalleProveedorComponent } from './components/proveedor/detalle-proveedor/detalle-proveedor.component';
import { DetalleOcComponent } from './components/oc/detalle-oc/detalle-oc.component';
import { DetalleProductoComponent } from './components/producto/detalle-producto/detalle-producto.component';
import { CountryService } from './services/country.service';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MainComponent,
    FormProveedorComponent,
    FormProductoComponent,
    FormOcComponent,
    TarjProveedorComponent,
    TarjProductoComponent,
    TarjOcComponent,
    HomeComponent,
    DetalleComponent,
    DetalleProveedorComponent,
    DetalleOcComponent,
    DetalleProductoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule, FormsModule, RouterModule
  ],
  providers: [CountryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
