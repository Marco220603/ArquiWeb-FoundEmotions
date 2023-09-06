package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

//Comment "probando 1 2 3"
public class Genero {

    private int id_genero;
    private String nameGenero;

    //a chambear pe causa

    public Genero() {

    }

    public Genero(int id_genero, String nameGenero) {
        this.id_genero = id_genero;
        this.nameGenero = nameGenero;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getNameGenero() {
        return nameGenero;
    }

    public void setNameGenero(String nameGenero) {
        this.nameGenero = nameGenero;
    }
}
