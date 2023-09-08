package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Artista")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_artista;
    @Column(name = "nombre",length = 45,nullable = false)
    private String nameArtista;
    public Artista() {
    }
    public Artista(int id_artista, String nameArtista) {
        this.id_artista = id_artista;
        this.nameArtista = nameArtista;
    }

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }

    public String getNameArtista() {
        return nameArtista;
    }

    public void setNameArtista(String nameArtista) {
        this.nameArtista = nameArtista;
    }
}
