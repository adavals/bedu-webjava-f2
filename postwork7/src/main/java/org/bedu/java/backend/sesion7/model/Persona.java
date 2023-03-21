package org.bedu.java.backend.sesion7.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Persona implements Comparable<Persona> {
    @NotBlank(message = "Introducir nombre.")
    private String nombre;
    @Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$", message = "El formato del teléfono debe de ser 00-000-000.")
    private String telefono;
    public Persona() {

    }
    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre'" + nombre + '\'' +
                ", telefono=" + telefono + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persona persona) {
        return this.nombre.compareTo(persona.nombre);
    }
}
