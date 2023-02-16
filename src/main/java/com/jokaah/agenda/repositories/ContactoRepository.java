package com.jokaah.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jokaah.agenda.models.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

}
