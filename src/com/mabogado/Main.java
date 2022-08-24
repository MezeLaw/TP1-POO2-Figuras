package com.mabogado;

import com.mabogado.figuras.Figura;
import com.mabogado.generador.Generador;
import com.mabogado.menu.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String fileName = "src/figuras.txt";

    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();

        System.out.println("Bienvenido al programa de figuras :) \n");
        System.out.println("Obteniendo figuras a partir del archivo txt local. Aguarde por favor.... \n");

        Generador gen = new Generador();

        Figura[] figuras = gen.generarFigurasDesdeArchivo(fileName);

        System.out.println("Ingrese la opcion deseada: \n");

        menu.mostrarOpciones();

        boolean salir = false;

        while (!salir) {
            Scanner sn = new Scanner(System.in);
            int opcion = sn.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese la posición que quiere consultar: ");
                    Scanner sn2 = new Scanner(System.in);
                    int posicion = sn.nextInt() + 1;
                    menu.consultarPosicion(posicion, figuras);
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    System.out.println("Objetos creados: ");
                    menu.listarObjetos(figuras);
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5");
                    break;
                case 6:
                    System.out.println("Has seleccionado la opcion 6");
                    break;
                case 7:
                    menu.salir();
                    salir = true;
                    break;
                default:
                    menu.mostrarOpciones();
                    break;
            }
        }
    }
}
