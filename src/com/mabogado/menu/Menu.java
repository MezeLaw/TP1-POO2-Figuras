package com.mabogado.menu;

import com.mabogado.figuras.Circulo;
import com.mabogado.figuras.Figura;
import com.mabogado.figuras.Rectangulo;
import com.mabogado.figuras.Triangulo;

public class Menu {

    private String[] opciones;

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public Menu(){
        String[] ops = {"1- Consultar Posicion ", "2- Dar de baja objeto", "3- Agregar objeto manualmente",
                "4- Listar objetos", "5- Objeto con superficie maxima", "6- Objeto con superficie minima", "7- Salir"};
        this.opciones = ops;
    }

    public Menu(String[]opciones){
        this.opciones = opciones;
    }

    /*
        Pre: No requiere args
        Post: imprime las opciones disponibles del menu
     */

    public void mostrarOpciones(){
        for(String op : this.opciones ){
            System.out.println(op);
        }
    }

    /*
        Pre: recibe una posicion (int) y un vector de figuras
        Post: muestra la figura de la posicion indicada siempre y cuando no sea null
     */

    public void consultarPosicion(int posicion, Figura[]figuras) {
        if(figuras[posicion]!= null){
            System.out.println(figuras[posicion].mostrar());
        }
    }

    /*
        Pre: recibe una posicion (int) y un vector de figuras
        Post: elimina la figura de la posicion indicada
     */

    public void darDeBajaObjeto(int posicion, Figura[] figuras) {
        figuras[posicion] = null;
        System.out.println("Se elimino el objeto de la posicion indicada");
    }

    /*
        Pre: Se reciben la inicial de la figura, y los valores que correspondan (radio, altura o base)
        Post: se agrega manualmente al vector la nueva figura
     */

    public Figura[] agregarObjetoManualmente(String inicial, double radio, double altura, double base, Figura[] figuras){

        int indiceVacio = verificarEspacioVacio(figuras);

        if (indiceVacio == -1 ) {
            Figura[] figurasAux = agrandarVector(figuras);
            return crearFigura(figurasAux, figurasAux.length-1, inicial, radio, base, altura);

        }
        return crearFigura(figuras, indiceVacio, inicial,radio, base,altura);
    }

    public void listarObjetos(Figura[] figuras) {

        System.out.println("");

        for (int i=0; i<figuras.length; i++){
             if(figuras[i]!=null){
                 System.out.println(figuras[i].mostrar());
             }
        }

        System.out.println("");
    }

    /*
           Pre: Se recibe un vector de figuras
           Post: se retorna la superficie maxima
     */

    public void indicarSuperficieMaxima(Figura[] figuras) {

        double superficieMaxima = 0;

        for (Figura figura : figuras ) {
            if (figura!= null && figura.getSuperficie()>superficieMaxima) {
                superficieMaxima = figura.getSuperficie();
            }
        }
        System.out.println("La superficie maxima es de : " + superficieMaxima + "\n");
    }

    /*
        Pre: Se recibe un vector de figuras
        Post: se retorna la superficie minima
     */

    public void indicarSuperficieMinima(Figura[] figuras) {
        //Arbitrariamente asigno el primero no null como el mayor. Definir manejo de excepciones
        double superficieMinima = -1;
        for(Figura f : figuras) {
            if (f != null ) {
                superficieMinima = f.getSuperficie();
            }
        }

        for (Figura figura : figuras ) {
            if (figura!= null && figura.getSuperficie()<superficieMinima) {
                superficieMinima = figura.getSuperficie();
            }
        }
        System.out.println("La superficie minima es de : " + superficieMinima + "\n");
    }

    public void salir(){
        System.out.println("Gracias por utilizar la aplicacion de figuras. Hasta luego! ");
        System.out.println(" ");
        System.exit(0);
    }

    /*
        Pre: Se brinda un vector de figuras
        Post: se retorna el indice vacio. En caso de no encontrar alguno, retorna -1
     */

    public int verificarEspacioVacio(Figura[] figuras){
        int indiceVacio = -1;
        for (int i=0; i<figuras.length; i++){
            if (figuras[i]==null){
                indiceVacio = i;
                //break;
                return indiceVacio;
            }
        }
        return indiceVacio;
    }

    /*
        Pre: recibe el viejo vector
        Post: retorna un vector con el size aumentado y los valores copiados
     */

    public Figura[] agrandarVector(Figura[] figuras) {
        Figura[] figurasAux = new Figura[figuras.length+1];

        for(int a = 0; a<figuras.length;a++){
            figurasAux[a]=figuras[a];
        }

        return figurasAux;
    }

    /*
        Pre: recibe el vector de figuras, el indice en el que se agregará, y los valores de la figura a crear
        Post: retorna el vector de figuras con la figura nueva incluida
     */
    public Figura[] crearFigura(Figura[] figuras, int indice, String inicial, double radio, double base, double altura){

        if (inicial.equals("T")){
            Triangulo tri = new Triangulo(base, altura);
            figuras[indice] = tri;
        }

        if (inicial.equals("R")){
            Rectangulo re = new Rectangulo(base, altura);
            figuras[indice] = re;
        }

        if (inicial.equals("C")){
            Circulo ci = new Circulo(radio);
            figuras[indice] = ci;
        }
        return figuras;
    }

}
