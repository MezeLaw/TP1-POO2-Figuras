package com.mabogado.figuras;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        this.superficie();
    }

    public Circulo() {}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double superficie() {
        this.setSuperficie(Math.PI*this.radio*this.radio);
        return this.getSuperficie();
    }

    @Override
    public String mostrar() {
        return "Circulo de radio "+ this.radio + " y superficie " + this.superficie();
    }
}
