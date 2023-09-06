package com.example.demo.entities;


public class Temperamento {
    private int id_temperamento;
    private String nameTemperamento;
    private String descriptionTemperamento;
    private Genero genero_id;

    public Temperamento() {
    }
    public Temperamento(int id_temperamento, String nameTemperamento, String descriptionTemperamento, Genero genero_id) {
        this.id_temperamento = id_temperamento;
        this.nameTemperamento = nameTemperamento;
        this.descriptionTemperamento = descriptionTemperamento;
        this.genero_id = genero_id;
    }

    public int getId_temperamento() {
        return id_temperamento;
    }

    public void setId_temperamento(int id_temperamento) {
        this.id_temperamento = id_temperamento;
    }

    public String getNameTemperamento() {
        return nameTemperamento;
    }

    public void setNameTemperamento(String nameTemperamento) {
        this.nameTemperamento = nameTemperamento;
    }

    public String getDescriptionTemperamento() {
        return descriptionTemperamento;
    }

    public void setDescriptionTemperamento(String descriptionTemperamento) {
        this.descriptionTemperamento = descriptionTemperamento;
    }

    public Genero getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(Genero genero_id) {
        this.genero_id = genero_id;
    }
}
