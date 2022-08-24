package br.com.itau.escola.controller;

import br.com.itau.escola.model.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("funcionario")
public class funcionarioController {

    @GetMapping
    public Funcionario returnFuncionario() {
        Funcionario funcionario = new Funcionario(1L);
        return funcionario;
    }
}
