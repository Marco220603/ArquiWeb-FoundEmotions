package com.example.demo.Controllers;

import com.example.demo.dtos.ArtistaDTO;
import com.example.demo.dtos.CancionesDTO;
import com.example.demo.entities.Artista;
import com.example.demo.entities.Canciones;
import com.example.demo.serviceinterfaces.IArtistaService;
import com.example.demo.serviceinterfaces.ICancionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/artista")
public class ArtistaController {
    @Autowired
    private IArtistaService aR;

    @PostMapping
    public void registrar(@RequestBody ArtistaDTO dto) {
        ModelMapper m = new ModelMapper();
        Artista a = m.map(dto, Artista.class);
        aR.insertar(a);
    }

    @PutMapping
    public void modificar(@RequestBody ArtistaDTO dto) {
        ModelMapper m = new ModelMapper();
        Artista a = m.map(dto, Artista.class);
        aR.insertar(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        aR.eliminar(id);
    }

    @GetMapping("/{id}")
    public ArtistaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        ArtistaDTO dto=m.map(aR.listarId(id),ArtistaDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ArtistaDTO> listar() {
        return aR.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ArtistaDTO.class);

        }).collect(Collectors.toList());
    }
}