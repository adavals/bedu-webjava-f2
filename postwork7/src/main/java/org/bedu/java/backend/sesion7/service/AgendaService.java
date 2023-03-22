package org.bedu.java.backend.sesion7.service;

import org.bedu.java.backend.sesion7.model.Persona;
import org.bedu.java.backend.sesion7.repository.Agenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AgendaService {
    private Agenda agenda;
    private ValidadorTelefono validadorTelefono;
    private FormateadorTelefono formateadorTelefono;
    
    @Autowired
    public AgendaService (Agenda agenda, ValidadorTelefono validadorTelefono, FormateadorTelefono formateadorTelefono){
        this.agenda=agenda;
        this.validadorTelefono=validadorTelefono;
        this.formateadorTelefono=formateadorTelefono;
          }

    public Persona creaPersona(Persona persona){
        if(validadorTelefono.isValido(persona.getTelefono())) {
            System.out.println("Creando persona.");
            persona.setTelefono(formateadorTelefono.formatea(persona.getTelefono()));
            return agenda.creaPersona(persona);
        } else {
            System.out.println("Telefono no valido.");
            return null;
        }
    }

    public Set<Persona> listaPersonas() {
        return agenda.listaPersonas();
    }

}
