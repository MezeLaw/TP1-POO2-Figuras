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
                    System.out.println("Ingrese la posición que quiere consultar: \n");
                    sn = new Scanner(System.in);
                    int p1 = sn.nextInt() - 1;
                    menu.consultarPosicion(p1, figuras);
                    System.out.println("\n");
                    menu.mostrarOpciones();
                    break;
                case 2:
                    System.out.println("Ingrese la posicion a eliminar: \n");
                    sn = new Scanner(System.in);
                    int p2 = sn.nextInt() - 1;
                    menu.darDeBajaObjeto(p2, figuras);
                    menu.mostrarOpciones();
                    break;
                case 3:
                    System.out.println("Indique el tipo de objeto a agregar manualmente.\n");
                    System.out.println("1-Circulo \n");
                    System.out.println("2-Rectangulo \n");
                    System.out.println("3-Triangulo \n");


                    int p3 = sn.nextInt();

                    switch (p3){
                        case 1:
                            System.out.println("Ingrese radio del circulo: \n");
                            double radio = sn.nextDouble();
                            figuras = menu.agregarObjetoManualmente("C", radio, 0, 0, figuras);
                            menu.mostrarOpciones();
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Ingrese base del rectangulo: \n");
                            double baseRectangulo = sn.nextDouble();
                            System.out.println("Ingrese altura del rectangulo: \n");
                            double alturaRectangulo = sn.nextDouble();
                            figuras = menu.agregarObjetoManualmente("R", 0, baseRectangulo, alturaRectangulo, figuras);
                            menu.mostrarOpciones();
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println("Ingrese base del triangulo: \n");
                            double baseTriangulo = sn.nextDouble();
                            System.out.println("Ingrese altura del triangulo: \n");
                            double alturaTriangulo =sn.nextDouble();
                            figuras = menu.agregarObjetoManualmente("T", 0, baseTriangulo, alturaTriangulo, figuras);
                            menu.mostrarOpciones();
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Opcion invalida. Volviendo al menu ppal\n");
                            menu.mostrarOpciones();
                    }

                    menu.mostrarOpciones();
                    break;
                case 4:
                    System.out.println("Objetos creados: ");
                    menu.listarObjetos(figuras);
                    menu.mostrarOpciones();
                    break;
                case 5:
                    System.out.println("El objeto con superficie maxima es: \n");
                    menu.indicarSuperficieMaxima(figuras);
                    menu.mostrarOpciones();
                    break;
                case 6:
                    System.out.println("El objeto con superficie minima es: \n");
                    menu.indicarSuperficieMinima(figuras);
                    menu.mostrarOpciones();
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
