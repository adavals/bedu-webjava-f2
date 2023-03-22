package org.bedu.java.backend.postwork7.model;

import jakarta.validation.constraints.*;

public class Persona implements Comparable<Persona> {
    @NotBlank(message = "El nombre es un campo obligatorio.")
    private String nombre;

    @Pattern(regexp = "^\\d{2}-\\d{4}-\\d{4}$", message = "El teléfono debe tener un formato de ##-####-####")
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public int compareTo(Persona other) {
        return this.nombre.compareTo(other.nombre);
    }

}
