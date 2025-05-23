package com.example.ECIsaludvital.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "especialidades")
public class Especialidad {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private String doctor;
    private String ubicacion;
    private String imagenUrl;

}
