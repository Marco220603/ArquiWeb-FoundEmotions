package com.example.demo.entities;

public class ResultadoCuestionario {
    private int id_resultadoCuestionario;
    private Usuario usuario_id;
    private Preguntas preguntas_id;
    private int puntajeTotal;
    private Temperamento temperamento_id;

    public ResultadoCuestionario() {
    }

    public ResultadoCuestionario(int id_resultadoCuestionario, Usuario usuario_id, Preguntas preguntas_id, int puntajeTotal, Temperamento temperamento_id) {
        this.id_resultadoCuestionario = id_resultadoCuestionario;
        this.usuario_id = usuario_id;
        this.preguntas_id = preguntas_id;
        this.puntajeTotal = puntajeTotal;
        this.temperamento_id = temperamento_id;
    }

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
