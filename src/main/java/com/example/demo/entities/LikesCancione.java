package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "LikesCancion")

public class LikesCancione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_likecanciones;
    @ManyToOne
    @JoinColumn(name = "usuario_id",referencedColumnName = "id_usuario")
    private Usuario usuario_id;
    @OneToOne
    @JoinColumn(name = "id_canciones",referencedColumnName = "id_canciones")
    private Canciones cancion_id;
    @Column(name = "Fecha")
    private LocalDate fecha;

    public LikesCancione() {
    }

    public LikesCancione(int id_likecanciones, Usuario usuario_id, Canciones cancion_id, LocalDate fecha) {
        this.id_likecanciones = id_likecanciones;
        this.usuario_id = usuario_id;
        this.cancion_id = cancion_id;
        this.fecha = fecha;
    }

    public int getId_likecanciones() {
        return id_likecanciones;
    }

    public void setId_likecanciones(int id_likecanciones) {
        this.id_likecanciones = id_likecanciones;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Canciones getCancion_id() {
        return cancion_id;
    }

    public void setCancion_id(Canciones cancion_id) {
        this.cancion_id = cancion_id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


}
