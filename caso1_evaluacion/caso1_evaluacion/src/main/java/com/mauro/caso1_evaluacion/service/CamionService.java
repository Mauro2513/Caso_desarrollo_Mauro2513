package com.mauro.caso1_evaluacion.service;

import com.mauro.caso1_evaluacion.model.Camion;
import com.mauro.caso1_evaluacion.repository.CamionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CamionService {

    private final CamionRepository camionRepository;

    public CamionService(CamionRepository camionRepository) {
        this.camionRepository = camionRepository;
    }

    // Crear un camión
    public Camion crearCamion(Camion camion) {
        return camionRepository.save(camion);
    }

    // Consultar camión por placa
    public Optional<Camion> consultarPorPlaca(String placa) {
        return Optional.ofNullable(camionRepository.findByPlaca(placa));
    }

    // Actualizar camión
    public Camion actualizarCamion(Camion camion) {
        return camionRepository.save(camion);
    }

    // Eliminar camión
    public void eliminarCamion(Long id) {
        camionRepository.deleteById(id);
    }
}
