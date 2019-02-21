package com.sistemas.vendas.controller;

import com.sistemas.vendas.model.Produto;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProdutoRepository extends Repository<Produto, Integer> {

    void delete(Produto produto);

    List<Produto> findAll();

    Produto findOne(int codigo);

    Produto save(Produto produto);
}
