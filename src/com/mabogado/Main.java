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
            try {
                Scanner sn = new Scanner(System.in);
                int opcion = sn.nextInt();
                figuras = menu.seleccionarOpcion(opcion, figuras);
            } catch (Exception e){
                System.out.println("Ocurrio un problema al procesar el pedido. Intente nuevamente!");
                menu.mostrarOpciones();
            }
        }
    }
}
