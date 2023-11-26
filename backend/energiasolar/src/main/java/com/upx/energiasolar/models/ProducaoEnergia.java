package com.upx.energiasolar.models;

import java.math.BigDecimal;

public class ProducaoEnergia {

    private double producaoDiaria;
    private double producaoMensal;
    private double rendimentoDiario;
    private BigDecimal rendimentoMensal;

    public ProducaoEnergia(double producaoDiaria, double producaoMensal, double rendimentoDiario, BigDecimal rendimentoMensal) {
        this.producaoDiaria = producaoDiaria;
        this.producaoMensal = producaoMensal;
        this.rendimentoDiario = rendimentoDiario;
        this.rendimentoMensal = rendimentoMensal;
    }


    public double getProducaoDiaria() {
        return producaoDiaria;
    }

    public void setProducaoDiaria(double producaoDiaria) {
        this.producaoDiaria = producaoDiaria;
    }

    public double getProducaoMensal() {
        return producaoMensal;
    }

    public void setProducaoMensal(double producaoMensal) {
        this.producaoMensal = producaoMensal;
    }

    public double getRendimentoDiario() {
        return rendimentoDiario;
    }

    public void setRendimentoDiario(double rendimentoDiario) {
        this.rendimentoDiario = rendimentoDiario;
    }

    public BigDecimal getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void setRendimentoMensal(BigDecimal rendimentoMensal) {
        this.rendimentoMensal = rendimentoMensal;
    }
}
