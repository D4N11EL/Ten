/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tendencias.service;

import com.example.tendencias.PersonaRepository;
import com.example.tendencias.service.GenericService;
import com.example.tendencias.service.GenericServiceImpl;
import com.repaso.repaso.model.Persona;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danie
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements GenericService<Persona, Long> {

    @Autowired
    PersonaRepository personarepository;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personarepository;

    }

}
