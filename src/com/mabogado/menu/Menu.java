package com.mabogado.menu;

import com.mabogado.figuras.Figura;

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

    public void mostrarOpciones(){
        for(String op : this.opciones ){
            System.out.println(op);
        }
    }

    public void consultarPosicion(int posicion, Figura[]figuras) {
        System.out.println(figuras[posicion].mostrar());
    }

    public void darDeBajaObjeto(int posicion, Figura[] figuras) {
        figuras[posicion] = null;
        System.out.println("Se elimino el objeto de la posicion: "+posicion);
    }


    public void agregarObjetoManualmente(){
        //TODO * - Agregar un nuevo objeto de forma manual (para esto debe verificar si hay espacio
        //     * libre en el vector, de lo contrario, deberá redimensionarlo).
    }

    public void listarObjetos(Figura[] figuras) {

        System.out.println("");
        System.out.println(" La cantidad de figuras existentes es de: " + figuras.length + "\n");

        for (int i=0; i<figuras.length; i++){
             if(figuras[i]!=null){
                 System.out.println(figuras[i].mostrar());
             }
        }

        System.out.println("");
    }

    public void indicarSuperficieMaxima(Figura[] figuras) {

        double superficieMaxima = 0;

        for (Figura figura : figuras ) {
            if (figura.getSuperficie()>superficieMaxima) {
                superficieMaxima = figura.getSuperficie();
            }
        }
        System.out.println("La superficie maxima es de : " + superficieMaxima + "\n");
    }


    public void indicarSuperficieMinima(Figura[] figuras) {
        //Arbitrariamente asigno el primero como el mayor. Definir manejo de excepciones
        double superficieMinima = figuras[0].getSuperficie();

        for (Figura figura : figuras ) {
            if (figura.getSuperficie()<superficieMinima) {
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

}
