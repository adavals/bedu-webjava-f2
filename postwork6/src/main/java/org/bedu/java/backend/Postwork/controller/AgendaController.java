package org.bedu.java.backend.Postwork.controller;

import org.bedu.java.backend.Postwork.model.Persona;
import org.bedu.java.backend.Postwork.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/api/v1/agenda")
public class AgendaController {
    private AgendaService agendaService;
    @Autowired
    public AgendaController(AgendaService agendaService){
        this.agendaService = agendaService;
    }

    @PostMapping
    public ResponseEntity<Persona> creaPersona(@RequestBody Persona persona){
        Persona respuesta = agendaService.creaPersona(persona);
        if (respuesta == null){
            persona.setTelefono(persona.getTelefono() + " -- Error en el número telefónico");
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(persona);
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(persona);
        }
    }
    @GetMapping
    public ResponseEntity<Set<Persona>> listaPersonas(){
        return ResponseEntity.status(HttpStatus.OK).body(agendaService.listaPersonas());
    }
}
