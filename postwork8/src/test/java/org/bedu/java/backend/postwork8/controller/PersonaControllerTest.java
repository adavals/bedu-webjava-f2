package org.bedu.java.backend.postwork8.controller;

import org.bedu.java.backend.postwork8.model.Persona;
import org.bedu.java.backend.postwork8.service.PersonaService;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.List;
@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(controllers = PersonaController.class)
class PersonaControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PersonaService personService;

    @Test
    @DisplayName("Prueba llamado a service de guardado")
    public void testSubmitForm() throws Exception {
        mockMvc.perform(post("/")
                        .param("nombre", "John")
                        .param("telefono", "1234567890"))
                .andExpect(status().isOk())
                .andExpect(view().name("result"))
                .andExpect(model().attributeExists("persons"));
        verify(personService, times(1)).guardaPersona(any(Persona.class));
    }


}