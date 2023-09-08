package com.example.demo.serviceinterfaces;

import com.example.demo.entities.PlaylistdeCancionesEnUsuarios;

import java.util.List;

public interface IPlaylistdeCancionesEnUsuariosService {

    public void insertar(PlaylistdeCancionesEnUsuarios playlistdeCancionesEnUsuarios) ;

    public void eliminar(int id_playlistEnUsuarios);

    public PlaylistdeCancionesEnUsuarios listarId(int id_playlistEnUsuarios);

    List<PlaylistdeCancionesEnUsuarios> listar();
}
