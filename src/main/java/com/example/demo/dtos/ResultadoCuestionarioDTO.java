package com.example.demo.dtos;

import com.example.demo.entities.Preguntas;
import com.example.demo.entities.Temperamento;

public class ResultadoCuestionarioDTO
{

    private int id_resultadoCuestionario;
    private Usuario usuario_id;
    private Preguntas preguntas_id;

    private int puntajeTotal;

    private Temperamento temperamento_id;

    public int getId_resultadoCuestionario() {
        return id_resultadoCuestionario;
    }

    public void setId_resultadoCuestionario(int id_resultadoCuestionario) {
        this.id_resultadoCuestionario = id_resultadoCuestionario;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Preguntas getPreguntas_id() {
        return preguntas_id;
    }

    public void setPreguntas_id(Preguntas preguntas_id) {
        this.preguntas_id = preguntas_id;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public Temperamento getTemperamento_id() {
        return temperamento_id;
    }

    public void setTemperamento_id(Temperamento temperamento_id) {
        this.temperamento_id = temperamento_id;
    }
}
