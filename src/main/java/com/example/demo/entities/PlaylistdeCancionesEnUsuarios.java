package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "PlaylistdeCancionesEnUsuarios")
//cuando un usuario crea un playlist

public class PlaylistdeCancionesEnUsuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "id_playlistEnUsuarios",referencedColumnName = "id_playlistEnUsuarios")
    private PlaylistEnUsuarios playlistEnUsuarios_id;
    @OneToOne
    @JoinColumn(name = "id_cancionesENplaylist",referencedColumnName = "id_cancionesENplaylist")
    private CancionesEnPlaylist cancionesEnPlaylist_id;

    public PlaylistdeCancionesEnUsuarios() {
    }

    public PlaylistdeCancionesEnUsuarios(int id, PlaylistEnUsuarios playlistEnUsuarios_id, CancionesEnPlaylist cancionesEnPlaylist_id) {
        this.id = id;
        this.playlistEnUsuarios_id = playlistEnUsuarios_id;
        this.cancionesEnPlaylist_id = cancionesEnPlaylist_id;
    }

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
