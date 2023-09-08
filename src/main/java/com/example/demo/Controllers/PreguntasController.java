package com.example.demo.Controllers;

import com.example.demo.dtos.PreguntasDTO;
import com.example.demo.entities.Preguntas;
import com.example.demo.serviceinterfaces.IPreguntasService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/preguntas")
public class PreguntasController {
    @Autowired
    private IPreguntasService pG ;

    @PostMapping
    public void registrar(@RequestBody PreguntasDTO dto) {
        ModelMapper m = new ModelMapper();
        Preguntas p = m.map(dto, Preguntas.class);
        pG.insertar(p);
    }

    @PutMapping
    public void modificar(@RequestBody PreguntasDTO dto) {
        ModelMapper m = new ModelMapper();
        Preguntas p = m.map(dto,Preguntas.class);
        pG.insertar(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pG.eliminar(id);
    }

    @GetMapping("/{id}")
    public PreguntasDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        PreguntasDTO dto=m.map(pG.listarId(id),PreguntasDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<PreguntasDTO> listar() {
        return pG.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PreguntasDTO.class);

        }).collect(Collectors.toList());
    }
}