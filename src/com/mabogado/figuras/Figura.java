package com.mabogado.figuras;

public abstract class Figura {

    private double superficie;

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public abstract double superficie();
    public abstract String mostrar();
}
