package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="CompartirPlaylists")

public class CompartirPlaylist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_compartirPlaylist;
    @OneToOne
    @JoinColumn(name= "PlaylistdeCancionesEnusuarios",referencedColumnName = "id")
    private PlaylistdeCancionesEnUsuarios playlistdeCancionesEnUsuarios_id;
    @Column(name = "elemmentoID")
    private String elementoID;
    @Column(name = "destinoID")
    private String destinoID;

    public CompartirPlaylist() {
    }

    public CompartirPlaylist(int id_compartirPlaylist, PlaylistdeCancionesEnUsuarios playlistdeCancionesEnUsuarios_id, String elementoID, String destinoID) {
        this.id_compartirPlaylist = id_compartirPlaylist;
        this.playlistdeCancionesEnUsuarios_id = playlistdeCancionesEnUsuarios_id;
        this.elementoID = elementoID;
        this.destinoID = destinoID;
    }

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
