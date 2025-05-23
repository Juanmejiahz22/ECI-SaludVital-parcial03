package com.example.ECIsaludvital.controller;

import com.example.ECIsaludvital.model.Cita;
import com.example.ECIsaludvital.model.Especialidad;
import com.example.ECIsaludvital.repository.EspecialidadRepository;
import com.example.ECIsaludvital.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private EspecialidadRepository especialidadRepo;

    @Autowired
    private CitaService citaService;

    @GetMapping("/especialidades")
    public List<Especialidad> listar() {
        return especialidadRepo.findAll();
    }

    @PostMapping("/citas")
    public Cita agendar(@RequestBody Cita cita) {
        return citaService.programarCita(cita);
    }

    @GetMapping("/citas")
    public List<Cita> historial(@RequestParam String correo,
                                @RequestParam(required = false) String estado) {
        return citaService.historial(correo, estado);
    }

    @PutMapping("/citas/{id}/cancelar")
    public void cancelar(@PathVariable String id) {
        citaService.cancelarCita(id);
    }
}
