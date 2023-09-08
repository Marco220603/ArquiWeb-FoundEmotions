package com.example.demo.entities;

import com.example.demo.entities.Canciones;
import com.example.demo.entities.Usuario;

import javax.persistence.*;

@Entity
@Table(name = "Playlist")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_playlist;

    @Column(name = "nombre",length = 35,nullable = false)
    private String namePlaylist;

    @Column(name = "descrpcion",length = 50)
    private String Descripcion;

    public Playlist() {
    }

    public Playlist(int id_playlist, String namePlaylist, String descripcion) {
        this.id_playlist = id_playlist;
        this.namePlaylist = namePlaylist;
        Descripcion = descripcion;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
