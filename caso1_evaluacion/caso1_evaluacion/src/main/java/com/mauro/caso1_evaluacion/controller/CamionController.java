package com.mauro.caso1_evaluacion.controller;

import com.mauro.caso1_evaluacion.model.Camion;
import com.mauro.caso1_evaluacion.service.CamionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/camiones")
public class CamionController {

    @Autowired
    private CamionService camionService;

    // Crear un camión
    @PostMapping
    public Camion crearCamion(@RequestBody Camion camion) {
        return camionService.crearCamion(camion);
    }

    // Consultar camión por placa
    @GetMapping("/{placa}")
    public Camion obtenerPorPlaca(@PathVariable String placa) {
        return camionService.consultarPorPlaca(placa).orElse(null);
    }
}
