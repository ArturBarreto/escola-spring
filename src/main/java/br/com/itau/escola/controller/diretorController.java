package br.com.itau.escola.controller;

import br.com.itau.escola.model.Diretor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diretor")
public class diretorController {

    @GetMapping
    public Diretor returnDiretor() {
        Diretor diretor = new Diretor(1L);
        return diretor;
    }
}
