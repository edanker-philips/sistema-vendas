package com.sistemas.vendas.controller;

import com.sistemas.vendas.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Override
    public Produto create(Produto produto) {
        return repository.save(produto);
    }

    @Override
    public Produto delete(int codigo) {
        Produto produto = findById(codigo);
        if(produto != null){
            repository.delete(produto);
        }
        return produto;
    }

    @Override
    public List<Produto> findAll() {
        return repository.findAll();
    }

    @Override
    public Produto findById(int codigo) {
        return repository.findOne(codigo);
    }

    @Override
    public Produto update(Produto produto) {
        return repository.save(produto);
    }
}