package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="generos")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_genero;
    @Column(name="nameGenero",length = 40, nullable = false)
    private String nameGenero;

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
