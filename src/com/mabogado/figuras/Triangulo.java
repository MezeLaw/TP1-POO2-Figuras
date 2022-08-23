package com.mabogado.figuras;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){}

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
        return (this.altura*this.base)/2;
    }

    @Override
    public String mostrar() {
        return "Triangulo de altura" + this.altura + " base " + this.base + " y superficie " + this.superficie();
    }
}