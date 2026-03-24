package com.unifsa.alunos;

public class AlunoPosGraduacao extends Aluno {

    public AlunoPosGraduacao(String nome, int matricula, double nota) {
        super(nome, matricula, nota);
    }

    public void verificarAprovacao() {
        if (getNota() >= 6) {
            System.out.println("Aprovado (Pos)");
        } else {
            System.out.println("Reprovado (Pos)");
        }
    }

    public void publicarArtigo() {
        System.out.println("Artigo publicado!");
    }
}