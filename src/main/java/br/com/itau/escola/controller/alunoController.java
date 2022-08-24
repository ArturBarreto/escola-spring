package br.com.itau.escola.controller;

import br.com.itau.escola.model.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class alunoController {

    @GetMapping
    public Aluno retrunAluno() {
        Aluno aluno = new Aluno("Artur",
                                35,
                                1202258328L,
                                true,
                                987357801L);
        return aluno;
    }
}
