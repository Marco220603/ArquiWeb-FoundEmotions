package com.example.demo.serviceinterfaces;

import com.example.demo.entities.Canciones;

import java.util.List;

public interface ICancionService {

    public void insertar(Canciones cancion) ;

    public void eliminar(int id_canciones);

    public Canciones listarId(int id_canciones);

    List<Canciones> listar();

}




