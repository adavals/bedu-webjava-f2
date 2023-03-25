package org.bedu.java.backend.postwork8.service;

import org.bedu.java.backend.postwork8.model.Persona;
import org.bedu.java.backend.postwork8.persistence.PersonaRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)

class PersonaServiceTest {
    @Mock
    private PersonaRepository personaRepository;

    @InjectMocks
    private PersonaService personaService;

    @Test
    @DisplayName("Prueba agregar persona en bdd")
    public void testAddPerson() {
        Persona persona = new Persona();
        persona.setNombre("Prueba");
        persona.setTelefono("1234567890");
        personaService.guardaPersona(persona);
        verify(personaRepository, times(1)).save(persona);
    }
}