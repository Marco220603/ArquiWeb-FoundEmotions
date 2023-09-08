package com.example.demo.Controllers;



import com.example.demo.dtos.TemperamentoDTO;
import com.example.demo.entities.Temperamento;
import com.example.demo.serviceinterfaces.ITemperamentoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/temperamento")
public class TemperamentoController {
    @Autowired
    private ITemperamentoService iS;

    @PostMapping
    public void registrar(@RequestBody TemperamentoDTO dto) {
        ModelMapper m = new ModelMapper();
        Temperamento p = m.map(dto, Temperamento.class);
        iS.insertar(p);
    }

    @PutMapping
    public void modificar(@RequestBody TemperamentoDTO dto) {
        ModelMapper m = new ModelMapper();
        Temperamento p = m.map(dto,Temperamento.class);
        iS.insertar(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        iS.eliminar(id);
    }

    @GetMapping("/{id}")
    public TemperamentoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        TemperamentoDTO dto=m.map(iS.listarId(id),TemperamentoDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<TemperamentoDTO> listar() {
        return iS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TemperamentoDTO.class);

        }).collect(Collectors.toList());
    }
}
