package com.example.demo.serviceimplements;

import com.example.demo.entities.PlaylistdeCancionesEnUsuarios;
import com.example.demo.repositories.IPlaylistDeCancionesEnUsuariosRepository;
import com.example.demo.serviceinterfaces.IPlaylistdeCancionesEnUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PlaylistdeCancionesEnUsuariosServiceImplement implements IPlaylistdeCancionesEnUsuariosService {
    @Autowired
    private IPlaylistDeCancionesEnUsuariosRepository ipR;

    @Override
    public void insertar(PlaylistdeCancionesEnUsuarios playlistdeCancionesEnUsuarios) {
        ipR.save(playlistdeCancionesEnUsuarios);
    }

    @Override
    public void eliminar(int id_playlistEnUsuarios) {
        ipR.deleteById(id_playlistEnUsuarios);
    }

    @Override
    public PlaylistdeCancionesEnUsuarios listarId(int id_playlistEnUsuarios) {
        return ipR.findById(id_playlistEnUsuarios).orElse(new PlaylistdeCancionesEnUsuarios());
    }

    @Override
    public List<PlaylistdeCancionesEnUsuarios> listar() {
        return ipR.findAll();
    }
}
