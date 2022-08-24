package br.com.itau.escola.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Materia {
    private Long id;
    private String nome;
    private String ementa;
    private Double cargaHoraria;
    private List<String> materiais;
    private List<Professor> professores;
}
