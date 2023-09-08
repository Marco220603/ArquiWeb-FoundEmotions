package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "AristasEnGenero")
public class ArtistaEnGenero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArtistaEnGenero;
    @ManyToOne
    @JoinColumn(name = "artista_id",referencedColumnName = "id_artista")
    private Artista artista_id;
    @ManyToOne
    @JoinColumn(name = "genero_id",referencedColumnName = "id_genero")
    private Genero genero_id;

    public ArtistaEnGenero() {
    }

    public ArtistaEnGenero(int idArtistaEnGenero, Artista artista_id, Genero genero_id) {
        this.idArtistaEnGenero = idArtistaEnGenero;
        this.artista_id = artista_id;
        this.genero_id = genero_id;
    }

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
