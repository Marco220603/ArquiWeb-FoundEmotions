package com.example.demo.Controllers;

import com.example.demo.dtos.PlaylistDTO;
import com.example.demo.entities.Playlist;
import com.example.demo.serviceinterfaces.IPlaylistService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {
    @Autowired
    private IPlaylistService pS;

    @PostMapping
    public void registrar(@RequestBody PlaylistDTO dto) {
        ModelMapper m = new ModelMapper();
        Playlist p = m.map(dto, Playlist.class);
        pS.insertar(p);
    }

    @PutMapping
    public void modificar(@RequestBody PlaylistDTO dto) {
        ModelMapper m = new ModelMapper();
        Playlist p = m.map(dto,Playlist.class);
        pS.insertar(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pS.eliminar(id);
    }

    @GetMapping("/{id}")
    public PlaylistDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        PlaylistDTO dto=m.map(pS.listarId(id),PlaylistDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<PlaylistDTO> listar() {
        return pS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PlaylistDTO.class);

        }).collect(Collectors.toList());
    }
}