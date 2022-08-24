package br.com.itau.escola.model;

import java.util.List;

public class Coordenador extends Funcionario implements Assalariado {
    private List<Curso> cursos;

    public Coordenador(Long registro, String nome) {
        super(registro, nome);
        super.cargo = Cargo.Cargos.COORDENADOR;
    }

    public double calcularValor(double horasTrabalhadas) {
        double valorBonus = cursos.size() * .01 * valorSalario;
        return valorSalario + valorBonus;
    }
}
