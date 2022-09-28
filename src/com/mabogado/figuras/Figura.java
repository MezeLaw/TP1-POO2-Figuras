package com.mabogado.figuras;

public abstract class Figura {

    private double superficie;

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /*
        Retorna la superficie de una figura
     */
    public abstract double superficie();

    /*
        Muestra la informacion de la figura
     */
    public abstract String mostrar();
}
