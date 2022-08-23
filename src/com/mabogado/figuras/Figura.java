package com.mabogado.figuras;

public abstract class Figura {

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract double superficie();
    public abstract String mostrar();
}
