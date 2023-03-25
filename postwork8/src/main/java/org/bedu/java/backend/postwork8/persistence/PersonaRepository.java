package org.bedu.java.backend.postwork8.persistence;

import org.bedu.java.backend.postwork8.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    List<Persona> findAllByOrderByNombreAsc();
}
