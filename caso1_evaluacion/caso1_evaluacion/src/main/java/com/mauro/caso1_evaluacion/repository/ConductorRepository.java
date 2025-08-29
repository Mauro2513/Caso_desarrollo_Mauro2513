package com.mauro.caso1_evaluacion.repository;

import com.mauro.caso1_evaluacion.model.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConductorRepository extends JpaRepository<Conductor, Long> {
}
