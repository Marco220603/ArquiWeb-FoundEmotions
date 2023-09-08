package com.example.demo.dtos;

public class CancionesDTO
{
    private int id_canciones;

    private String titulo;
    private ArtistaEnGenero idArtistaEnGenero;

    public int getId_canciones() {
        return id_canciones;
    }

    public void setId_canciones(int id_canciones) {
        this.id_canciones = id_canciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArtistaEnGenero getIdArtistaEnGenero() {
        return idArtistaEnGenero;
    }

    public void setIdArtistaEnGenero(ArtistaEnGenero idArtistaEnGenero) {
        this.idArtistaEnGenero = idArtistaEnGenero;
    }
}
