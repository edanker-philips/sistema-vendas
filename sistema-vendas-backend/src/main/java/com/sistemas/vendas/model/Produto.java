package com.sistemas.vendas.model;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @Column
    private int codigo;
    @Column
    private String descricao;
    @Column
    private int preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() { return preco; }

    public void setPreco(int preco) { this.preco = preco; }
}
