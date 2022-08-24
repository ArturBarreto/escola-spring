package br.com.itau.escola.controller;

import br.com.itau.escola.model.Materia;
import br.com.itau.escola.model.Professor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/materia")
public class materiaController {

    @GetMapping
    public Materia returnMateria() {
        Materia materia = new Materia(1L,
                                      "POO",
                                      "Introdução; Classes; Objetos; Polimorfismo",
                                      80D,
                                       new ArrayList<String>(),
                                       new ArrayList<Professor>());
        return materia;
    }
}
