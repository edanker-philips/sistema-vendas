package com.sistemas.vendas.controller;

import com.sistemas.vendas.model.Produto;

import java.util.List;

public interface ProdutoService {

    Produto create(Produto user);

    Produto delete(int id);

    List<Produto> findAll();

    Produto findById(int id);

    Produto update(Produto user);
}
