package com.example.demo.Controllers;


import com.example.demo.dtos.GeneroDTO;
import com.example.demo.entities.Genero;
import com.example.demo.serviceinterfaces.IGeneroService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/genero")
public class GeneroController {
    @Autowired
    private IGeneroService sG ;

    @PostMapping
    public void registrar(@RequestBody GeneroDTO dto) {
        ModelMapper m = new ModelMapper();
        Genero g = m.map(dto, Genero.class);
        sG.insertar(g);
    }

    @PutMapping
    public void modificar(@RequestBody GeneroDTO dto) {
        ModelMapper m = new ModelMapper();
        Genero g = m.map(dto, Genero.class);
        sG.insertar(g);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        sG.eliminar(id);
    }

    @GetMapping("/{id}")
    public GeneroDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        GeneroDTO dto=m.map(sG.listarId(id),GeneroDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<GeneroDTO> listar() {
        return sG.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,GeneroDTO.class);

        }).collect(Collectors.toList());
    }
}