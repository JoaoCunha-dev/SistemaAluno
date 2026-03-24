package com.unifsa.alunos;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula, double nota) {

        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Aluno sem nome";
        } else {
            this.nome = nome;
        }

        this.matricula = matricula;

        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            this.nota = 0;
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota: " + nota);
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota invalida!");
        }
    }

    public void ajustarNota(double novaNota) {
        setNota(novaNota);
    }
}