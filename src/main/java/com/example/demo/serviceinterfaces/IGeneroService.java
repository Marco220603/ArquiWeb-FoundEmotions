package com.example.demo.serviceinterfaces;

import com.example.demo.entities.Genero;

import java.util.List;

public interface IGeneroService {
    public void insertar(Genero genero) ;

    public void eliminar(int id_genero);

    public Genero listarId(int id_genero);

    List<Genero> listar();
}
