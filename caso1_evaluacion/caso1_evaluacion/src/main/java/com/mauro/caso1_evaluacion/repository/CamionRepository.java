package com.mauro.caso1_evaluacion.repository;

import com.mauro.caso1_evaluacion.model.Camion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamionRepository extends JpaRepository<Camion, Long> {
    // Método para buscar un camión por placa
    Camion findByPlaca(String placa);
}
