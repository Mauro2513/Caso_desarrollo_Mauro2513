package com.mauro.caso1_evaluacion.service;

import com.mauro.caso1_evaluacion.model.Conductor;
import com.mauro.caso1_evaluacion.repository.ConductorRepository;
import org.springframework.stereotype.Service;

@Service
public class ConductorService {

    private final ConductorRepository conductorRepository;

    public ConductorService(ConductorRepository conductorRepository) {
        this.conductorRepository = conductorRepository;
    }

    // Crear conductor
    public Conductor crearConductor(Conductor conductor) {
        return conductorRepository.save(conductor);
    }

}
