package com.example.demo.dtos;

import com.example.demo.entities.CancionesEnPlaylist;
import com.example.demo.entities.PlaylistEnUsuarios;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class PlaylistdeCancionesEnUsuariosDTO {
    private int id;

    private PlaylistEnUsuarios playlistEnUsuarios_id;

    private CancionesEnPlaylist cancionesEnPlaylist_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
