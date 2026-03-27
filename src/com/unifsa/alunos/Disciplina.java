package com.unifsa.alunos;

import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome, Professor professor) {

        if (professor == null) {
            throw new IllegalArgumentException("Disciplina precisa de um professor!");
        }

        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {

        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        } else {
            System.out.println("Aluno ja esta na disciplina!");
        }
    }

    public void listarAlunos() {
        for (Aluno a : alunos) {
            a.exibirDados();
            System.out.println("------");
        }
    }
}