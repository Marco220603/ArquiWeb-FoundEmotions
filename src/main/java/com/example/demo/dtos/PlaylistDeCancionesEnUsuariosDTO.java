package com.example.demo.dtos;

public class PlaylistDeCancionesEnUsuariosDTO
{

    private int idPlaylistdeCancionesEnUsuarios;

    private PlaylistEnUsuarios playlistEnUsuarios_id;

    private CancionesEnPlaylist cancionesEnPlaylist_id;

    public int getIdPlaylistdeCancionesEnUsuarios() {
        return idPlaylistdeCancionesEnUsuarios;
    }

    public void setIdPlaylistdeCancionesEnUsuarios(int idPlaylistdeCancionesEnUsuarios) {
        this.idPlaylistdeCancionesEnUsuarios = idPlaylistdeCancionesEnUsuarios;
    }

    public PlaylistEnUsuarios getPlaylistEnUsuarios_id() {
        return playlistEnUsuarios_id;
    }

    public void setPlaylistEnUsuarios_id(PlaylistEnUsuarios playlistEnUsuarios_id) {
        this.playlistEnUsuarios_id = playlistEnUsuarios_id;
    }

    public CancionesEnPlaylist getCancionesEnPlaylist_id() {
        return cancionesEnPlaylist_id;
    }

    public void setCancionesEnPlaylist_id(CancionesEnPlaylist cancionesEnPlaylist_id) {
        this.cancionesEnPlaylist_id = cancionesEnPlaylist_id;
    }
}
