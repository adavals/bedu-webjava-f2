package org.bedu.java.backend.Postwork.controller;


import org.bedu.java.backend.Postwork.model.Persona;
import org.bedu.java.backend.Postwork.service.FormateadorTelefono;
import org.bedu.java.backend.Postwork.service.ValidadorTelefono;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/persona")
public class PersonaController {


    // TODO: Postwork6
    @PostMapping
    public ResponseEntity<Persona> creaPersona(@RequestBody Persona persona){
        ValidadorTelefono validadorTelefono = new ValidadorTelefono();
        persona.setTelefono(validadorTelefono.limpiaNumero(persona.getTelefono()));
        if(validadorTelefono.isValido(persona.getTelefono())) {
            System.out.println("Creando persona.");
            FormateadorTelefono formateadorTelefono = new FormateadorTelefono();
            persona.setTelefono(formateadorTelefono.formatea(persona.getTelefono()));
            return ResponseEntity.status(HttpStatus.CREATED).body(persona);
        }

        System.out.println("Telefono no valido.");
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
    }


}
