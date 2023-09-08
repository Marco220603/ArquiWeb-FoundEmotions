package com.example.demo.serviceimplements;

import com.example.demo.entities.Artista;
import com.example.demo.entities.Canciones;
import com.example.demo.repositories.IArtistaRepository;
import com.example.demo.serviceinterfaces.IArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaServiceImplement implements IArtistaService {
    @Autowired
    private IArtistaRepository iaR;

    @Override
    public void insertar(Artista artista) {
        iaR.save(artista);
    }

    @Override
    public void eliminar(int id_artista) {
        iaR.deleteById(id_artista);
    }

    @Override
    public Artista listarId(int id_artista) {
        return iaR.findById(id_artista).orElse(new Artista());
    }

    @Override
    public List<Artista> listar() {
        return iaR.findAll();
    }
}
