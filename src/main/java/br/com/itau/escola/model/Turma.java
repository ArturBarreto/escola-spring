package br.com.itau.escola.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Long id;
    private List<Aluno> alunos;
    private Curso curso;

    private int vagas;

    public Turma(Long id, Curso curso) {
        this.id = id;
        this.curso = curso;
        this.alunos = new ArrayList<>();
        this.vagas = 25;
    }

    public void adicionar(Aluno aluno) throws Exception {
        if (alunos.contains(aluno)) {
            throw new Exception();
        }
        alunos.add(aluno);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int numeroDeAlunos() {
        return alunos.size();
    }

    public boolean hasVagas() {
        return alunos.size() < vagas;
    }
}
