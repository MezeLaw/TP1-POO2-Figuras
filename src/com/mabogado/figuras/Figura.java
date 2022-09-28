package com.mabogado.figuras;

public abstract class Figura {

    private double superficie;

    /**
     * Post:
     *
     * @return superficie de la figura
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Pre:
     *
     * @param superficie dada la superficie,
     *                   Post: setea la superficie con el valor recibido
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Post:
     *
     * @return la superficie de la figugra
     */
    public abstract double superficie();

    /**
     * Post:
     *
     * @return muestra la informacion de la figura
     */
    public abstract String mostrar();
}
