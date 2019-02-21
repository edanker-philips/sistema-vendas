import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { UserComponent } from './user/user.component';
import {ProdutoComponent} from './produto/produto.component';
import {VendasComponent} from './vendas/vendas.component';

const routes: Routes = [
  { path: 'users', component: UserComponent },
  { path: 'produtos', component: ProdutoComponent },
  { path: 'vendas', component: VendasComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
