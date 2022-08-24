package br.com.itau.escola.controller;

import br.com.itau.escola.model.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class cursoController {

    @GetMapping
    public Curso returnCurso() {
        Curso curso = new Curso(1L,
                                "Itaú Dev Experts");
        return curso;
    }
}
