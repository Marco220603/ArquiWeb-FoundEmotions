package com.example.demo.entities;



import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Playlist")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre",length = 50,nullable = false)
    private String nombre;
    @Column(name = "descripcion",length = 200,nullable = false)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "usuario_id",referencedColumnName = "id")
    private Usuario usuarioid;
    @OneToMany
    @JoinColumn(name = "canciones_id",referencedColumnName = "id")
    private List<Canciones> cancionesid;

    public Playlist() {
    }

    public Playlist(int id, String nombre, String descripcion, Usuario usuarioid, List<Canciones> cancionesid) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.usuarioid = usuarioid;
        this.cancionesid = cancionesid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(Usuario usuarioid) {
        this.usuarioid = usuarioid;
    }

    public List<Canciones> getCancionesid() {
        return cancionesid;
    }

    public void setCancionesid(List<Canciones> cancionesid) {
        this.cancionesid = cancionesid;
    }
}
