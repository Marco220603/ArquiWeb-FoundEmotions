package com.example.demo.entities;

import java.time.LocalDate;
import java.util.Date;

public class Usuarios {

    private int id_usuario;
    private String nameUsuario;
    private String email;
    private String password;
    private LocalDate fechaRegistra;

    public Usuarios() {
    }

    public Usuarios(int id_usuario, String nameUsuario, String email, String password, LocalDate fechaRegistra) {
        this.id_usuario = id_usuario;
        this.nameUsuario = nameUsuario;
        this.email = email;
        this.password = password;
        this.fechaRegistra = fechaRegistra;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getFechaRegistra() {
        return fechaRegistra;
    }

    public void setFechaRegistra(LocalDate fechaRegistra) {
        this.fechaRegistra = fechaRegistra;
    }
}
