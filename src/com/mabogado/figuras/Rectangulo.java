package com.mabogado.figuras;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    /**
     * Pre:
     * recibe los
     *
     * @param base
     * @param altura Post: instancia un rectangulo
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.superficie();
    }

    /**
     * Post: instancia un Rectangulo
     */
    public Rectangulo() {
    }

    /**
     * Post:
     *
     * @return el valor de la base del rectangulo
     */
    public double getBase() {
        return base;
    }

    /**
     * Pre:
     * recibe el @param base
     * Post: define la base del rectangulo con el valor recibido
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Post:
     *
     * @return retorna la altura del rectangulo
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Pre:
     * dado el @param altura
     * Post:
     * setea la altura del rectangulo
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Post:
     *
     * @return retorna la superficie del rectangulo
     */
    @Override
    public double superficie() {
        this.setSuperficie(this.altura * this.base);
        return this.getSuperficie();
    }

    /**
     * Post:
     *
     * @return muestra la información del rectangulo
     */
    @Override
    public String mostrar() {
        return "Rectangulo de base " + this.base + " y altura " + this.altura + " y superficie " + this.superficie();
    }
}
