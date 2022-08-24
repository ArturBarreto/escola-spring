package br.com.itau.escola.controller;

import br.com.itau.escola.model.Coordenador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coordenador")
public class coordenadorController {

    @GetMapping
    public Coordenador getCoordenador() {
        Coordenador coordenador = new Coordenador(1234L,
                                                  "Jessé");
        return coordenador;
    }
}
