package com.mauro.caso1_evaluacion.model;

import jakarta.persistence.*;

@Entity
public class Camion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;

    @OneToOne
    @JoinColumn(name = "conductor_id")
    private Conductor conductor;

    // Constructor vacío
    public Camion() {}

    // Constructor con parámetros
    public Camion(String placa, Conductor conductor) {
        this.placa = placa;
        this.conductor = conductor;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public Conductor getConductor() { return conductor; }
    public void setConductor(Conductor conductor) { this.conductor = conductor; }
}
