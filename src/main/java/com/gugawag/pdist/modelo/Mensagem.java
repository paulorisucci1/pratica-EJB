package com.gugawag.pdist.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mensagem {

    public Mensagem() {
    }

    public Mensagem(long id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    @Id
    private long id;

    private String texto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
