package org.bedu.java.backend.sesion7.repository;

import org.bedu.java.backend.sesion7.model.Persona;
import org.springframework.stereotype.Repository;
import java.util.SortedSet;
import java.util.TreeSet;
@Repository
public class Agenda {
    private static final SortedSet<Persona> setPersona = new TreeSet<>();
    public Persona creaPersona(Persona persona){
        setPersona.add(persona);
        return persona;
    }
    public SortedSet<Persona> listaPersonas(){
        return setPersona;
    }
}