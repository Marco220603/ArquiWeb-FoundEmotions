package com.example.demo.serviceimplements;

import com.example.demo.entities.Canciones;
import com.example.demo.repositories.ICancionRepository;
import com.example.demo.serviceinterfaces.ICancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List ;


@Service
public class CancionServiceImplement implements ICancionService {
    @Autowired
    private ICancionRepository icA;

    @Override
    public void insertar(Canciones cancion) {
        icA.save(cancion);
    }

    @Override
    public void eliminar(int id_canciones) {
        icA.deleteById(id_canciones);
    }

    @Override
    public Canciones listarId(int id_canciones) {
        return icA.findById(id_canciones).orElse(new Canciones());
    }

    @Override
    public List<Canciones> listar() {
        return icA.findAll();
    }
}

