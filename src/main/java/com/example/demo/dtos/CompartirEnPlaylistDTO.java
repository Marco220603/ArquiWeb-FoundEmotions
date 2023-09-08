package com.example.demo.dtos;

import com.example.demo.entities.PlaylistdeCancionesEnUsuarios;

public class CompartirEnPlaylistDTO {

    private int id_compartirPlaylist;
    private PlaylistdeCancionesEnUsuarios playlistdeCancionesEnUsuarios_id;
    private String elementoID;

    private String destinoID;

    public int getId_compartirPlaylist() {
        return id_compartirPlaylist;
    }

    public void setId_compartirPlaylist(int id_compartirPlaylist) {
        this.id_compartirPlaylist = id_compartirPlaylist;
    }

    public PlaylistdeCancionesEnUsuarios getPlaylistdeCancionesEnUsuarios_id() {
        return playlistdeCancionesEnUsuarios_id;
    }

    public void setPlaylistdeCancionesEnUsuarios_id(PlaylistdeCancionesEnUsuarios playlistdeCancionesEnUsuarios_id) {
        this.playlistdeCancionesEnUsuarios_id = playlistdeCancionesEnUsuarios_id;
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
