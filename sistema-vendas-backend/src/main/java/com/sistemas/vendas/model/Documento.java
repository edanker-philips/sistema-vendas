package com.sistemas.vendas.model;

import javax.persistence.*;

@Entity
@Table(name = "documento")
public class Documento {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;
    @Column
    private int total;
    @Column
    private String confirmado;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(String confirmado) {
        this.confirmado = confirmado;
    }
}
