package com.jokaah.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jokaah.agenda.models.Contacto;
import com.jokaah.agenda.services.ContactoService;

@RestController
public class ContactoController {

    @Autowired
    ContactoService contactoService;

    @GetMapping("/contactos")
    List<Contacto> all() {
        return contactoService.findAll();
    }

    @GetMapping("/contactos/{id}")
    Contacto find(@PathVariable int id) {
        return contactoService.findById(id);
    }

    @PostMapping("/contactos")
    void save(@RequestBody Contacto contacto) {
        contactoService.save(contacto);
    }

    @PutMapping("/contactos/{id}")
    void update(@PathVariable int id, @RequestBody Contacto contacto) {
        contactoService.update(id, contacto);
    }

    @DeleteMapping("/contactos/{id}")
    void delete(@PathVariable int id) {
        contactoService.deleteById(id);
    }

}
