package com.example.demo.dtos;

import com.example.demo.entities.Playlist;

public class PlaylistEnUsuariosDTO
{
    private int id_playlistEnUsuarios;
    private Playlist playlist_id;

    private Usuario usuario_id;

    public int getId_playlistEnUsuarios() {
        return id_playlistEnUsuarios;
    }

    public void setId_playlistEnUsuarios(int id_playlistEnUsuarios) {
        this.id_playlistEnUsuarios = id_playlistEnUsuarios;
    }

    public Playlist getPlaylist_id() {
        return playlist_id;
    }

    public void setPlaylist_id(Playlist playlist_id) {
        this.playlist_id = playlist_id;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }
}
