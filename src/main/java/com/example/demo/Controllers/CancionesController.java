package com.example.demo.Controllers;

import com.example.demo.serviceinterfaces.ICancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/canciones")
public class CancionesController {
    @Autowired
    private ICancionService cS;
    

}
