package com.example.demo.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Temperamento")
public class Temperamento {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   @Column(name = "nombre",length = 20,nullable = false)
   private String nombre;
   @Column(name = "descripcion",length = 200,nullable = false)
   private String descripcion;
   @ManyToMany
   @JoinColumn(name = "id_genero",referencedColumnName = "id")
   private List<Genero> generoid;

    public Temperamento() {
    }

    public Temperamento(int id, String nombre, String descripcion, List<Genero> generoid) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.generoid = generoid;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Genero> getGeneroid() {
        return generoid;
    }

    public void setGeneroid(List<Genero> generoid) {
        this.generoid = generoid;
    }
}
