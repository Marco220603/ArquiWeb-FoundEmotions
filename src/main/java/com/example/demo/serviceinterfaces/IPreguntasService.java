package com.example.demo.serviceinterfaces;

import com.example.demo.entities.Preguntas;

import java.util.List;

public interface IPreguntasService {

    public void insertar(Preguntas preguntas) ;

    public void eliminar(int id_preguntas);

    public Preguntas listarId(int id_preguntas);

    List<Preguntas> listar();
}
