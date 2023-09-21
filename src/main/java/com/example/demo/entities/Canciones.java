package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Canciones")
public class Canciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "genero_id",referencedColumnName = "id")
    private Genero generoid;
    @ManyToOne
    @JoinColumn(name = "artista_id",referencedColumnName = "id")
    private Artista artistaid;
    @Column(name = "fecha")
    private LocalDate fecha;

    public Canciones() {
    }

    public Canciones(int id, String nombre, Genero generoid, Artista artistaid, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.generoid = generoid;
        this.artistaid = artistaid;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGeneroid() {
        return generoid;
    }

    public void setGeneroid(Genero generoid) {
        this.generoid = generoid;
    }

    public Artista getArtistaid() {
        return artistaid;
    }

    public void setArtistaid(Artista artistaid) {
        this.artistaid = artistaid;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
