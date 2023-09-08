package com.example.demo.dtos;

import com.example.demo.entities.Canciones;
import com.example.demo.entities.Playlist;

public class CancionesEnPlaylistDTO {
    private int id_cancionesENplaylist;

    private Playlist playlistid;

    private Canciones cancionid;

    public int getId_cancionesENplaylist() {
        return id_cancionesENplaylist;
    }

    public void setId_cancionesENplaylist(int id_cancionesENplaylist) {
        this.id_cancionesENplaylist = id_cancionesENplaylist;
    }

    public Playlist getPlaylistid() {
        return playlistid;
    }

    public void setPlaylistid(Playlist playlistid) {
        this.playlistid = playlistid;
    }

    public Canciones getCancionid() {
        return cancionid;
    }

    public void setCancionid(Canciones cancionid) {
        this.cancionid = cancionid;
    }
}
