package com.example.demo.entities;

public class CompartirPlaylist {
    private int id_compartirPlaylist;
    private Playlist playlist_id;
    private Usuarios usuario_id;
    private String elementoID;
    private String destinoID;

    public CompartirPlaylist() {
    }

    public CompartirPlaylist(int id_compartirPlaylist, Playlist playlist_id, Usuarios usuario_id, String elementoID, String destinoID) {
        this.id_compartirPlaylist = id_compartirPlaylist;
        this.playlist_id = playlist_id;
        this.usuario_id = usuario_id;
        this.elementoID = elementoID;
        this.destinoID = destinoID;
    }

    public int getId_compartirPlaylist() {
        return id_compartirPlaylist;
    }

    public void setId_compartirPlaylist(int id_compartirPlaylist) {
        this.id_compartirPlaylist = id_compartirPlaylist;
    }

    public Playlist getPlaylist_id() {
        return playlist_id;
    }

    public void setPlaylist_id(Playlist playlist_id) {
        this.playlist_id = playlist_id;
    }

    public Usuarios getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuarios usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getElementoID() {
        return elementoID;
    }

    public void setElementoID(String elementoID) {
        this.elementoID = elementoID;
    }

    public String getDestinoID() {
        return destinoID;
    }

    public void setDestinoID(String destinoID) {
        this.destinoID = destinoID;
    }
}
