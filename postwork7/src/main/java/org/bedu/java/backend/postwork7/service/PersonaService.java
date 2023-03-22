package org.bedu.java.backend.postwork7.service;

import org.bedu.java.backend.postwork7.model.Persona;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@Service
public class PersonaService {
    private static final SortedSet<Persona> personas = new TreeSet<>();


    public static void  guardaPersona(Persona persona) {
        personas.add(persona);
        System.out.println(persona.getNombre() + " ha sido agregado");
    }

    public static Set<Persona> getPersonas() {
        return personas;
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
    private String formatPhoneNumber(String telefono) {
        String formattedPhoneNumber = telefono.replaceAll("\\D", ""); // Remove non-digit characters
        formattedPhoneNumber = formattedPhoneNumber.replaceFirst("(\\d{2})(\\d{4})(\\d{4})", "($1)-$2-$3"); // Format phone number
        return formattedPhoneNumber;
    }

}
