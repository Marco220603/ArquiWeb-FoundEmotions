package com.example.demo.serviceinterfaces;


import com.example.demo.entities.Temperamento;

import java.util.List;

public interface ITemperamentoService {
    public void insertar(Temperamento temperamento);

    public void eliminar(int id_temperamento);

    public Temperamento listarId(int id_temperamento);

    List<Temperamento> listar();
}
