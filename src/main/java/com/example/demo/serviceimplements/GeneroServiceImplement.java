package com.example.demo.serviceimplements;

import com.example.demo.entities.Canciones;
import com.example.demo.entities.Genero;
import com.example.demo.repositories.ICancionRepository;
import com.example.demo.repositories.IGeneroRepository;
import com.example.demo.serviceinterfaces.IGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImplement implements IGeneroService {

    @Autowired
    private IGeneroRepository igA;

    @Override
    public void insertar(Genero genero) {
        igA.save(genero);
    }

    @Override
    public void eliminar(int id_genero) {
        igA.deleteById(id_genero);
    }

    @Override
    public Genero listarId(int id_genero) {
        return igA.findById(id_genero).orElse(new Genero());
    }

    @Override
    public List<Genero> listar() {
        return igA.findAll();
    }
}
