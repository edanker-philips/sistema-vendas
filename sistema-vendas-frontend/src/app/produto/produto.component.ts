import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Produto } from '../models/produto.model';
import { ProdutoService } from './produto.service';

@Component({
  templateUrl: './produto.component.html'
})
export class ProdutoComponent {

  produto: Produto = new Produto();

  constructor(private router: Router, private produtoService: ProdutoService) {

  }

  createProduto(): void {
    this.produtoService.createProduto(this.produto)
        .subscribe( data => {
          alert("Produto novo cadastrado.");
        });

  };

}
