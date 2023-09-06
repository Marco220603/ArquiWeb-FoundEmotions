package com.example.demo.entities;
public class Playlist {

    private int id_playlist;
    private String namePlaylist;
    private Usuarios usuario_id;
    private Canciones cancion_id;

    public Playlist() {
    }

    public Playlist(int id_playlist, String namePlaylist, Usuarios usuario_id, Canciones cancion_id) {
        this.id_playlist = id_playlist;
        this.namePlaylist = namePlaylist;
        this.usuario_id = usuario_id;
        this.cancion_id = cancion_id;
    }

    public int getId_playlist() {
        return id_playlist;
    }

    public void setId_playlist(int id_playlist) {
        this.id_playlist = id_playlist;
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
    }

    public Usuarios getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuarios usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Canciones getCancion_id() {
        return cancion_id;
    }

    public void setCancion_id(Canciones cancion_id) {
        this.cancion_id = cancion_id;
    }
}
