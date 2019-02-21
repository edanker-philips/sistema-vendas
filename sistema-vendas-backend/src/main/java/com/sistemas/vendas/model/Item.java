package com.sistemas.vendas.model;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @Column
    private int id;
    @Column
    private int numero_documento;
    @Column
    private int codigo_produto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }
}
