import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { AppRoutingModule } from './app.routing.module';
import {UserService} from './user/user.service';
import {HttpClientModule} from "@angular/common/http";

import {ProdutoService} from './produto/produto.service';
import {ProdutoComponent} from './produto/produto.component';
import {VendasComponent} from './vendas/vendas.component';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    ProdutoComponent,
    VendasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserService, ProdutoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
