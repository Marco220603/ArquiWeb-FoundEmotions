package com.example.demo.dtos;

import com.example.demo.entities.Genero;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.List;

public class TemperamentoDTO {
    private int id;
    private String nombre;
    private String descripcion;
    private List<Genero> generoid;

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
