package com.mauro.caso1_evaluacion.model;

import jakarta.persistence.*;

@Entity
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;

    @OneToOne(mappedBy = "conductor")
    private Camion camion;

    // Constructor vacío
    public Conductor() {}

    // Constructor con parámetros
    public Conductor(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public Camion getCamion() { return camion; }
    public void setCamion(Camion camion) { this.camion = camion; }
}
