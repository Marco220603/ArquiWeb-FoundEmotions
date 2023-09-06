package com.example.demo.entities;

@Entity
@Table (name="CompartirPlaylists")
public class CompartirPlaylist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_compartirPlaylist;
    @Column(name="playlist", nullable = false)
    private Playlist playlist_id;
    @Column(name="usuarios_id", nullable = false)
    private Usuarios usuario_id;
    @Column(name="elementoID",length = 100,nullable = false)
    private String elementoID;
    @Column(name="destinoID",length = 100,nullable = false)
    private String destinoID;
    @OneToOne
    @JoinColumn(name="id_playlist")
    private Playlist playlist;
    @OneToMany
    @JoinColumn(name="id_usuario")
    private Usuarios usuarios;

    public CompartirPlaylist() {
    }

    public CompartirPlaylist(int id_compartirPlaylist, Playlist playlist_id, Usuarios usuario_id, String elementoID, String destinoID, Playlist playlist, Usuarios usuarios) {
        this.id_compartirPlaylist = id_compartirPlaylist;
        this.playlist_id = playlist_id;
        this.usuario_id = usuario_id;
        this.elementoID = elementoID;
        this.destinoID = destinoID;
        this.playlist = playlist_id;
        this.usuarios = usuario_id;
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
