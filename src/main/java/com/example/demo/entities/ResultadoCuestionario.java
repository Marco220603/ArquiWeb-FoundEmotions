package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "ResultadoCuestionario")
public class ResultadoCuestionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_resultadoCuestionario;
    @ManyToOne
    @JoinColumn(name = "id_usuario",referencedColumnName = "id_usuario")
    private Usuario usuario_id;
    @ManyToOne
    @JoinColumn(name = "id_preguntas",referencedColumnName = "id_preguntas")
    private Preguntas preguntas_id;

    @Column(name = "puntajeTotal")
    private int puntajeTotal;
    @OneToOne
    @JoinColumn(name = "id_temperamento",referencedColumnName = "id_temperamento")
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
