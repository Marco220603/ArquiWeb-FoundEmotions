package com.example.demo.serviceinterfaces;

import com.example.demo.entities.Artista;


import java.util.List;

public interface IArtistaService {
    public void insertar(Artista artista) ;

    public void eliminar(int id_artista);

    public Artista listarId(int id_artista);

    List<Artista> listar();
}
