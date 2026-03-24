package com.unifsa.alunos;

public class Main {

    public static void main(String[] args) {

        AlunoGraduacao ag = new AlunoGraduacao("Joao", 123, 8);
        ag.exibirDados();
        ag.verificarAprovacao();

        System.out.println("-------------------");

        AlunoPosGraduacao ap = new AlunoPosGraduacao("Maria", 456, 5);
        ap.exibirDados();
        ap.verificarAprovacao();
        ap.publicarArtigo();

        System.out.println("-------------------");

        ap.ajustarNota(7);
        ap.verificarAprovacao();
    }
}