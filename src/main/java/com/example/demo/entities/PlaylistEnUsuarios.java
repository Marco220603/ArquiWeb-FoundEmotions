package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "PlaylistEnUsuarios")

public class PlaylistEnUsuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_playlistEnUsuarios;
    @ManyToOne
    @JoinColumn(name= "id_playlist",referencedColumnName = "id_playlist")
    private Playlist playlist_id;
    @ManyToOne
    @JoinColumn(name="id_usuario",referencedColumnName = "id_usuario")
    private Usuario usuario_id;

    public PlaylistEnUsuarios() {
    }

    public PlaylistEnUsuarios(int id_playlistEnUsuarios, Playlist playlist_id, Usuario usuario_id) {
        this.id_playlistEnUsuarios = id_playlistEnUsuarios;
        this.playlist_id = playlist_id;
        this.usuario_id = usuario_id;
    }

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
