package com.example.demo.dtos;

import com.example.demo.entities.Canciones;
import com.example.demo.entities.Usuario;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

public class PlaylistDTO {
    private int id;
    private String nombre;
    private String descripcion;
    private Usuario usuarioid;
    private List<Canciones> cancionesid;
}
