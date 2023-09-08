package com.example.demo.serviceimplements;

import com.example.demo.entities.Preguntas;
import com.example.demo.repositories.IPreguntasRepository;
import com.example.demo.serviceinterfaces.IPreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntasServiceImplement implements IPreguntasService {
    @Autowired
    private IPreguntasRepository ipA;

    @Override
    public void insertar(Preguntas preguntas) {
        ipA.save(preguntas);
    }

    @Override
    public void eliminar(int id_preguntas ) {
        ipA.deleteById(id_preguntas);
    }

    @Override
    public Preguntas listarId(int id_preguntas) {
        return ipA.findById(id_preguntas).orElse(new Preguntas());
    }

    @Override
    public List<Preguntas> listar() {
        return ipA.findAll();
    }
}
