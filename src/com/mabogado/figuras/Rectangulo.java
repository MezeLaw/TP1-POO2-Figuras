package com.mabogado.figuras;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.superficie();
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double superficie() {
        this.setSuperficie(this.altura * this.base);
        return this.getSuperficie();
    }

    @Override
    public String mostrar() {
        return "Rectangulo de base " + this.base + " y altura " + this.altura + " y superficie " + this.superficie();
    }
}
