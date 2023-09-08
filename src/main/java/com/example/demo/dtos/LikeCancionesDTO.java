package com.example.demo.dtos;
import com.example.demo.entities.Canciones;
import com.example.demo.entities.Usuarios;

import java.time.LocalDate;

public class LikeCancionesDTO
{
    private int id_likecanciones;
    private Usuarios usuario_id;
    private Canciones cancion_id;;
    private LocalDate fecha;

    public int getId_likecanciones() {
        return id_likecanciones;
    }

    public void setId_likecanciones(int id_likecanciones) {
        this.id_likecanciones = id_likecanciones;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}