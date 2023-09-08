package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "CancionesEnPlaylist")

public class CancionesEnPlaylist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cancionesENplaylist;
    @ManyToOne
    @JoinColumn(name = "id_playlist",referencedColumnName = "id_playlist")
    private Playlist playlistid;
    @ManyToOne
    @JoinColumn(name="id_canciones",referencedColumnName = "id_canciones")
    private Canciones cancionid;

    public CancionesEnPlaylist() {
    }

    public CancionesEnPlaylist(int id_cancionesENplaylist, Playlist playlistid, Canciones cancionid) {
        this.id_cancionesENplaylist = id_cancionesENplaylist;
        this.playlistid = playlistid;
        this.cancionid = cancionid;
    }

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
