package com.example.demo.entities;

public class Artista {
    private int id_artista;
    private String nameArtista;
    private Genero genero_id;

    public Artista() {
    }

    public Artista(int id_artista, String nameArtista, Genero genero_id) {
        this.id_artista = id_artista;
        this.nameArtista = nameArtista;
        this.genero_id = genero_id;
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

    public Genero getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(Genero genero_id) {
        this.genero_id = genero_id;
    }
}
