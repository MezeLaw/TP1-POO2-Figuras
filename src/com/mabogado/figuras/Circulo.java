package com.mabogado.figuras;

public class Circulo extends Figura {

    private double radio;

    /**
     * Pre:
     * dado un @param radio
     * Post:
     * instancia un circulo
     */
    public Circulo(double radio) {
        this.radio = radio;
        this.superficie();
    }

    /**
     * Post: Instancia un circulo
     */
    public Circulo() {
    }

    /**
     * Post:
     *
     * @return el radio del circulo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Pre:
     * se recibe @param radio
     * Post:
     * setea el radio con el valor recibido
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Post:
     *
     * @return la superficie del circulo
     */
    @Override
    public double superficie() {
        this.setSuperficie(Math.PI * this.radio * this.radio);
        return this.getSuperficie();
    }

    /**
     * Post:
     *
     * @return muestra la informacion del circulo
     */
    @Override
    public String mostrar() {
        return "Circulo de radio " + this.radio + " y superficie " + this.superficie();
    }
}
