package com.unifsa.alunos;

public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(String nome, int matricula, double nota) {
        super(nome, matricula, nota);
    }

    public void verificarAprovacao() {
        if (getNota() >= 7) {
            System.out.println("Aprovado (Graduaçao)");
        } else {
            System.out.println("Reprovado (Graduaçao)");
        }
    }
}