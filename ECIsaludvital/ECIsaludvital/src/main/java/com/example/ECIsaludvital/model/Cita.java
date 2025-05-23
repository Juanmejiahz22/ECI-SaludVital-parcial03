package com.example.ECIsaludvital.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "citas")
public class Cita {
    @Id
    private String id;
    private String nombreCompleto;
    private String cedula;
    private String correo;
    private LocalDate fecha;
    private String especialidad;
    private String doctor;
    private String ubicacion;
    private String estado;

}
