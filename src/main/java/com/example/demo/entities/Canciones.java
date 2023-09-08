package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Canciones")
public class Canciones {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id_canciones;
   @Column(name = "titulo",nullable = false)
   private String titulo;
   @ManyToOne
   @JoinColumn(name = "ArtistaenGenero",referencedColumnName = "")
   private ArtistaEnGenero idArtistaEnGenero;
   public Canciones() {
   }

   public Canciones(int id_canciones, String titulo, ArtistaEnGenero idArtistaEnGenero) {
      this.id_canciones = id_canciones;
      this.titulo = titulo;
      this.idArtistaEnGenero = idArtistaEnGenero;
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

   public ArtistaEnGenero getIdArtistaEnGenero() {
      return idArtistaEnGenero;
   }

   public void setIdArtistaEnGenero(ArtistaEnGenero idArtistaEnGenero) {
      this.idArtistaEnGenero = idArtistaEnGenero;
   }
}
