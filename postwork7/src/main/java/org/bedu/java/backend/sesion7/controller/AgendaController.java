package org.bedu.java.backend.sesion7.controller;

import org.bedu.java.backend.sesion7.model.Persona;
import org.bedu.java.backend.sesion7.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Set;

@Controller
public class AgendaController {
    private AgendaService agendaService;
    @Autowired
    public AgendaController(AgendaService agendaService){
        this.agendaService = agendaService;
    }

    @PostMapping("/registro")
        public ModelAndView registra(@Valid Persona persona) {

        agendaService.creaPersona(persona);

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listaPersonas", agendaService.creaPersona(new Persona()));
        return mav;
    }

    @GetMapping({"/", "/index"})
    public String formularioRegistro(Model model) {
        model.addAttribute("persona", new Persona());
        model.addAttribute("listaPersonas", agendaService.creaPersona(new Persona()));
        return "index";
    }
}

