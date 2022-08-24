package br.com.itau.escola.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Aluno {
    private String nome;
    private Integer idade;
    private Long cpf;
    private Boolean ativado;
    private Long registro;

}

