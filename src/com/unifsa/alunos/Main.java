package com.unifsa.alunos;

public class Main {

    public static void main(String[] args) {

        AlunoGraduacao ag = new AlunoGraduacao("Joao", 123, 8);
        ag.exibirDados();

        if (ag.verificarAprovacao()) {
            System.out.println("Aprovado (Graduaçao)");
        } else {
            System.out.println("Reprovado (Graduaçao)");
        }

        System.out.println("-------------------");

        AlunoPosGraduacao ap = new AlunoPosGraduacao("Maria", 456, 5);
        ap.exibirDados();

        if (ap.verificarAprovacao()) {
            System.out.println("Aprovado (Pos)");
        } else {
            System.out.println("Reprovado (Pos)");
        }

        ap.publicarArtigo();

        System.out.println("-------------------");

        ap.ajustarNota(7);

        if (ap.verificarAprovacao()) {
            System.out.println("Agora esta aprovado (Pos)");
        } else {
            System.out.println("Ainda reprovado (Pos)");
        }
    }
}