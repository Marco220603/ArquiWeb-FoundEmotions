package com.example.demo.serviceimplements;

import com.example.demo.entities.Preguntas;
import com.example.demo.entities.Temperamento;
import com.example.demo.repositories.IPreguntasRepository;
import com.example.demo.repositories.ITemperamentoRepository;
import com.example.demo.serviceinterfaces.ITemperamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperamentoServiceImplement implements ITemperamentoService {
    @Autowired
    private ITemperamentoRepository itR;

    @Override
    public void insertar(Temperamento temperamento) {
        itR.save(temperamento);
    }

    @Override
    public void eliminar(int id_temperamento ) {
        itR.deleteById(id_temperamento);
    }

    @Override
    public Temperamento listarId(int id_temperamento) {
        return itR.findById(id_temperamento).orElse(new Temperamento());
    }

    @Override
    public List<Temperamento> listar() {
        return itR.findAll();
    }
}
