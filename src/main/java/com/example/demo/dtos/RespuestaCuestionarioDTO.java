package com.example.demo.dtos;

import com.example.demo.entities.Preguntas;

public class RespuestaCuestionarioDTO
{
    private int id_rptacuestionario;
    private Preguntas preguntas_id;
    private int AlternativaSeleccionada;
    private int putanje;

    public int getId_rptacuestionario() {
        return id_rptacuestionario;
    }

    public void setId_rptacuestionario(int id_rptacuestionario) {
        this.id_rptacuestionario = id_rptacuestionario;
    }

    public Preguntas getPreguntas_id() {
        return preguntas_id;
    }

    public void setPreguntas_id(Preguntas preguntas_id) {
        this.preguntas_id = preguntas_id;
    }

    public int getAlternativaSeleccionada() {
        return AlternativaSeleccionada;
    }

    public void setAlternativaSeleccionada(int alternativaSeleccionada) {
        AlternativaSeleccionada = alternativaSeleccionada;
    }

    public int getPutanje() {
        return putanje;
    }

    public void setPutanje(int putanje) {
        this.putanje = putanje;
    }
}
