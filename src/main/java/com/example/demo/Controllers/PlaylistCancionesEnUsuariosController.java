package com.example.demo.Controllers;


import com.example.demo.dtos.PlaylistdeCancionesEnUsuariosDTO;
import com.example.demo.entities.PlaylistdeCancionesEnUsuarios;
import com.example.demo.serviceinterfaces.IPlaylistdeCancionesEnUsuariosService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/playlistusuario")
public class PlaylistCancionesEnUsuariosController {
    @Autowired
    private IPlaylistdeCancionesEnUsuariosService pC;

    @PostMapping
    public void registrar(@RequestBody PlaylistdeCancionesEnUsuariosDTO dto) {
        ModelMapper m = new ModelMapper();
        PlaylistdeCancionesEnUsuarios p = m.map(dto, PlaylistdeCancionesEnUsuarios.class);
        pC.insertar(p);
    }

    @PutMapping
    public void modificar(@RequestBody PlaylistdeCancionesEnUsuariosDTO dto) {
        ModelMapper m = new ModelMapper();
        PlaylistdeCancionesEnUsuarios p = m.map(dto,PlaylistdeCancionesEnUsuarios.class);
        pC.insertar(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pC.eliminar(id);
    }

    @GetMapping("/{id}")
    public PlaylistdeCancionesEnUsuariosDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        PlaylistdeCancionesEnUsuariosDTO dto=m.map(pC.listarId(id),PlaylistdeCancionesEnUsuariosDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<PlaylistdeCancionesEnUsuariosDTO> listar() {
        return pC.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PlaylistdeCancionesEnUsuariosDTO.class);

        }).collect(Collectors.toList());
    }
}
