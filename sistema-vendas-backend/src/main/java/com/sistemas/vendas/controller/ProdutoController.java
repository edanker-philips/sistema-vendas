package com.sistemas.vendas.controller;

import com.sistemas.vendas.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/produtos"})
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto create(@RequestBody Produto produto){
        return produtoService.create(produto);
    }

    @GetMapping(path = {"/{codigo}"})
    public Produto findOne(@PathVariable("codigo") int codigo){
        return produtoService.findById(codigo);
    }

    @PutMapping(path = {"/{codigo}"})
    public Produto update(@PathVariable("codigo") int codigo, @RequestBody Produto produto){
        produto.setCodigo(codigo);
        return produtoService.update(produto);
    }

    @DeleteMapping(path ={"/{codigo}"})
    public Produto delete(@PathVariable("codigo") int codigo) {
        return produtoService.delete(codigo);
    }

    @GetMapping
    public List<Produto> findAll(){
        return produtoService.findAll();
    }
}