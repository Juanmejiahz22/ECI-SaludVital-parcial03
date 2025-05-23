package com.example.ECIsaludvital.repository;

import com.example.ECIsaludvital.model.Especialidad;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EspecialidadRepository extends MongoRepository<Especialidad, String> {}
