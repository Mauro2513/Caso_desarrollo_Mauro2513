package com.mauro.caso1_evaluacion.controller;

import com.mauro.caso1_evaluacion.model.Conductor;
import com.mauro.caso1_evaluacion.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conductores")
public class ConductorController {

    @Autowired
    private ConductorService conductorService;

    // Crear un conductor
    @PostMapping
    public Conductor crearConductor(@RequestBody Conductor conductor) {
        return conductorService.crearConductor(conductor);
    }
}
