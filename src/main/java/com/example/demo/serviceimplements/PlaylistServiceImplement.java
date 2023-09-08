package com.example.demo.serviceimplements;

import com.example.demo.entities.Playlist;
import com.example.demo.repositories.IPlaylistRespository;
import com.example.demo.serviceinterfaces.IPlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistServiceImplement implements IPlaylistService {
    @Autowired
    private IPlaylistRespository ipS;

    @Override
    public void insertar(Playlist playlist) {
        ipS.save(playlist);
    }

    @Override
    public void eliminar(int id_playlist) {
        ipS.deleteById(id_playlist);
    }

    @Override
    public Playlist listarId(int id_Playlist) {
        return ipS.findById(id_Playlist).orElse(new Playlist());
    }

    @Override
    public List<Playlist> listar() {
        return ipS.findAll();
    }
}
