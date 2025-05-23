package com.example.ECIsaludvital.service;

import com.example.ECIsaludvital.model.Cita;
import com.example.ECIsaludvital.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository repo;

    public Cita programarCita(Cita cita) {
        if (cita.getFecha().isBefore(LocalDate.now())) {
            cita.setEstado("Rechazada");
        } else {
            cita.setEstado("Confirmada");
        }
        return repo.save(cita);
    }

    public List<Cita> historial(String correo, String estado) {
        return estado == null ? repo.findByCorreo(correo) : repo.findByCorreoAndEstado(correo, estado);
    }

    public void cancelarCita(String id) {
        repo.findById(id).ifPresent(cita -> {
            cita.setEstado("Cancelada");
            repo.save(cita);
        });
    }
}
