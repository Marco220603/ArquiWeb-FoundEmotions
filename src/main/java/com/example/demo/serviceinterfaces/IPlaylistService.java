package com.example.demo.serviceinterfaces;

import com.example.demo.entities.Genero;
import com.example.demo.entities.Playlist;

import java.util.List;

public interface IPlaylistService {
    public void insertar(Playlist playlist) ;

    public void eliminar(int id_playlist);

    public Playlist listarId(int id_playlist);

    List<Playlist> listar();
}
