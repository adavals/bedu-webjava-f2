package org.bedu.java.backend.postwork7.controller;

import org.bedu.java.backend.postwork7.model.Persona;
import jakarta.validation.Valid;
import org.bedu.java.backend.postwork7.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.SortedSet;
import java.util.TreeSet;

@Controller
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping({"/", "/index"})
    public String formularioRegistro(Model model){
        model.addAttribute("persona", new Persona());
        model.addAttribute("personas", personaService.getPersonas());
        return "index";
    }
    @PostMapping("/registro")
    public ModelAndView registra(@Valid Persona persona, Errors errors) {
        if(errors.hasErrors()){
            ModelAndView mav = new ModelAndView("index");
            mav.addObject("personas", personaService.getPersonas());
            return mav;
        }
        personaService.guardaPersona(persona);

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("personas", personaService.getPersonas());
        return mav;
    }
}
