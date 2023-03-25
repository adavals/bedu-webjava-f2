package org.bedu.java.backend.postwork8.model;

import jakarta.validation.constraints.*;
import jakarta.persistence.*;
@Entity
@Table(name="PERSONA")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "El nombre es un campo obligatorio.")
    private String nombre;

    @Pattern(regexp = "^\\d{2}[- ]?\\d{4}[- ]?\\d{4}$", message = "El teléfono debe tener un formato de ##-####-####")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
