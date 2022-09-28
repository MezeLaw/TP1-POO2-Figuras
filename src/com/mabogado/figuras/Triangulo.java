package com.mabogado.figuras;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    /**
     * Pre:
     * recibe los
     *
     * @param base
     * @param altura Post: instancia un triangulo con los valores recibidos
     */
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.superficie();
    }

    /**
     * Post: instancia un triangulo
     */
    public Triangulo() {
    }

    /**
     * Post:
     *
     * @return retorna el valor de la base edl triangulo
     */
    public double getBase() {
        return base;
    }

    /**
     * Pre:
     * recibe @param base
     * Post:
     * setea la base del triangulo con el valor ingresado
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Post:
     *
     * @return retorna la altura del triangulo
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Pre:
     * recibe @param altura
     * Post: setea la altura del triangulo con el valor recibido
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Post:
     *
     * @return retorna la superficie del triangulo
     */
    @Override
    public double superficie() {
        this.setSuperficie((this.altura * this.base) / 2);
        return this.getSuperficie();
    }

    /**
     * Post:
     *
     * @return muestra la información del triangulo
     */
    @Override
    public String mostrar() {
        return "Triangulo de altura " + this.altura + " base " + this.base + " y superficie " + this.superficie();
    }
}
