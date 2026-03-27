package com.unifsa.alunos;

public class Professor {

    private String nome;
    private int matriculaFuncional;
    private double salario;

    public Professor(String nome, int matriculaFuncional, double salario) {

        this.nome = nome;
        this.matriculaFuncional = matriculaFuncional;

        if (salario >= 0) {
            this.salario = salario;
        } else {
            this.salario = 0;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double valor) {
        if (valor > 0) {
            this.salario += valor;
        } else {
            System.out.println("Valor invalido para aumento!");
        }
    }

    public String getNome() {
        return nome;
    }
}