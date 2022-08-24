package br.com.itau.escola.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Curso {
    private Long id;
    private String nome;
    // private List<Materia> materias;

}
