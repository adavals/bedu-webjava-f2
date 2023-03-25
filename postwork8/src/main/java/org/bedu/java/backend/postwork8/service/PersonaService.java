package org.bedu.java.backend.postwork8.service;

import org.bedu.java.backend.postwork8.model.Persona;
import org.bedu.java.backend.postwork8.persistence.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@Service
public class PersonaService {
    private static  PersonaRepository personaRepository ;
    @Autowired
    public PersonaService (PersonaRepository personaRepository){
        this.personaRepository=personaRepository;
    }
    public static void  guardaPersona(Persona persona) {
        String formatedPhone=persona.getTelefono();
        formatedPhone=formatPhoneNumber(formatedPhone);
        persona.setTelefono(formatedPhone);
        personaRepository.save(persona);
        System.out.println(persona.getNombre() + " ha sido agregado");
    }

    public static List<Persona> getPersonas() {
        return personaRepository.findAllByOrderByNombreAsc();
    }

    private static boolean isValidPhoneNumber(String telefono) {
        // Phone number regex pattern
        String phonePattern = "^\\d{2}[- ]?\\d{4}[- ]?\\d{4}$";
        if (digitsOnly(telefono).length() != 10) {
            return false;
        }
        return telefono.matches(phonePattern);
    }
    private static String digitsOnly(String telefono){
        String digitsOnly = telefono.replaceAll("[^\\d]", "");
        return  digitsOnly;
    }
    private static String formatPhoneNumber(String telefono) {
        String formattedPhoneNumber = digitsOnly(telefono); // Remove non-digit characters
        formattedPhoneNumber = formattedPhoneNumber.replaceFirst("(\\d{2})(\\d{4})(\\d{4})", "$1-$2-$3"); // Format phone number
        return formattedPhoneNumber;
    }

}
