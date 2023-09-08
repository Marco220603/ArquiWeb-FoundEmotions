package com.example.demo.Controllers;

import com.example.demo.dtos.CancionesDTO;
import com.example.demo.entities.Canciones;
import com.example.demo.serviceinterfaces.ICancionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/canciones")
public class CancionesController {
    @Autowired
    private ICancionService aS;

    @PostMapping
    public void registrar(@RequestBody CancionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Canciones a = m.map(dto, Canciones.class);
        aS.insertar(a);
    }

    @PutMapping
    public void modificar(@RequestBody CancionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Canciones a = m.map(dto, Canciones.class);
        aS.insertar(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        aS.eliminar(id);
    }

    @GetMapping("/{id}")
    public CancionesDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        CancionesDTO dto=m.map(aS.listarId(id),CancionesDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CancionesDTO> listar() {
        return aS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CancionesDTO.class);

        }).collect(Collectors.toList());
    }
}