package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Preguntas")
public class Preguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_preguntas;
    @Column(name = "textPregunta")
    private String textPregunta;
    @Column(name = "alternativa1")
    private String Alternativa_1;
    @Column(name = "alternativa2")
    private String Alternativa_2;
    @Column(name = "alternativa3")
    private String Alternativa_3;
    @Column(name = "alternativa4")
    private String Alternativa_4;

    public Preguntas() {
    }

    public Preguntas(int id_preguntas, String textPregunta, String alternativa_1, String alternativa_2, String alternativa_3, String alternativa_4) {
        this.id_preguntas = id_preguntas;
        this.textPregunta = textPregunta;
        Alternativa_1 = alternativa_1;
        Alternativa_2 = alternativa_2;
        Alternativa_3 = alternativa_3;
        Alternativa_4 = alternativa_4;
    }

    public int getId_preguntas() {
        return id_preguntas;
    }

    public void setId_preguntas(int id_preguntas) {
        this.id_preguntas = id_preguntas;
    }

    public String getTextPregunta() {
        return textPregunta;
    }

    public void setTextPregunta(String textPregunta) {
        this.textPregunta = textPregunta;
    }

    public String getAlternativa_1() {
        return Alternativa_1;
    }

    public void setAlternativa_1(String alternativa_1) {
        Alternativa_1 = alternativa_1;
    }

    public String getAlternativa_2() {
        return Alternativa_2;
    }

    public void setAlternativa_2(String alternativa_2) {
        Alternativa_2 = alternativa_2;
    }

    public String getAlternativa_3() {
        return Alternativa_3;
    }

    public void setAlternativa_3(String alternativa_3) {
        Alternativa_3 = alternativa_3;
    }

    public String getAlternativa_4() {
        return Alternativa_4;
    }

    public void setAlternativa_4(String alternativa_4) {
        Alternativa_4 = alternativa_4;
    }
}
