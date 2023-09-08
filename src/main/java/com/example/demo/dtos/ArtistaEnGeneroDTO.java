package com.example.demo.dtos;

import com.example.demo.entities.Artista;
import com.example.demo.entities.Genero;

public class ArtistaEnGeneroDTO {
    private int idArtistaEnGenero;

    private Artista artista_id;

    private Genero genero_id;

    public int getIdArtistaEnGenero() {
        return idArtistaEnGenero;
    }

    public void setIdArtistaEnGenero(int idArtistaEnGenero) {
        this.idArtistaEnGenero = idArtistaEnGenero;
    }

    public Artista getArtista_id() {
        return artista_id;
    }

    public void setArtista_id(Artista artista_id) {
        this.artista_id = artista_id;
    }

    public Genero getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(Genero genero_id) {
        this.genero_id = genero_id;
    }
}
