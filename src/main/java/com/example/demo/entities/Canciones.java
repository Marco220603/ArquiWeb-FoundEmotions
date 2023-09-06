package com.example.demo.entities;

public class Canciones {
   private int id_canciones;
   private String titulo;
   private Artista artista_id;
   private Genero genero_id;

   public Canciones() {
   }

   public Canciones(int id_canciones, String titulo, Artista artista_id, Genero genero_id) {
      this.id_canciones = id_canciones;
      this.titulo = titulo;
      this.artista_id = artista_id;
      this.genero_id = genero_id;
   }

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
