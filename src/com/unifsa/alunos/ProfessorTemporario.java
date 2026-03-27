package com.unifsa.alunos;

public class ProfessorTemporario extends Professor {

    private int mesesContrato;

    public ProfessorTemporario(String nome, int matriculaFuncional, double salario, int mesesContrato) {
        super(nome, matriculaFuncional, salario);
        this.mesesContrato = mesesContrato;
    }

    @Override
    public void aumentarSalario(double valor) {
        if (mesesContrato > 0) {
            super.aumentarSalario(valor);
        } else {
            System.out.println("Contrato encerrado! Nao e possivel aumentar salario.");
        }
    }

    public void diminuirMesesContrato() {
        if (mesesContrato > 0) {
            mesesContrato--;
        }
    }
}