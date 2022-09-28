package com.mabogado.menu;

import com.mabogado.figuras.Circulo;
import com.mabogado.figuras.Figura;
import com.mabogado.figuras.Rectangulo;
import com.mabogado.figuras.Triangulo;

import java.util.Scanner;

public class Menu {

    private String[] opciones;

    /**
     * Post:
     *
     * @return las opciones del menu
     */
    public String[] getOpciones() {
        return opciones;
    }

    /**
     * Pre:
     * recibe el @param opciones
     * Post:
     * setea las opciones del menu
     */
    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    /**
     * Post: Instancia un menu con opciones predefinidas
     */
    public Menu() {
        String[] ops = {"1- Consultar Posicion ", "2- Dar de baja objeto", "3- Agregar objeto manualmente",
                "4- Listar objetos", "5- Objeto con superficie maxima", "6- Objeto con superficie minima", "7- Salir"};
        this.opciones = ops;
    }

    /**
     * Pre:
     * recibe el @param opciones
     * Post:
     * instancia un menu con las opciones recibidas
     */
    public Menu(String[] opciones) {
        this.opciones = opciones;
    }

    /**
     * Post: muestra (imprime) las opciones del menu
     */
    public void mostrarOpciones() {
        for (String op : this.opciones) {
            System.out.println(op);
        }
    }

    /**
     * Pre:
     * recibe los param
     *
     * @param posicion
     * @param figuras  Post:
     *                 muestra la figura para la posición indicada
     */
    public void consultarPosicion(int posicion, Figura[] figuras) {
        if (figuras[posicion] != null) {
            System.out.println(figuras[posicion].mostrar());
        }
    }

    /**
     * Pre:
     * recibe los param
     *
     * @param posicion
     * @param figuras  Post:
     *                 elimina la figura de la posición indicada
     */

    public void darDeBajaObjeto(int posicion, Figura[] figuras) {
        figuras[posicion] = null;
        System.out.println("Se elimino el objeto de la posicion indicada");
    }

    /**
     * Pre: recibidos los param
     *
     * @param inicial
     * @param radio
     * @param altura
     * @param base
     * @param figuras Post:
     * @return crea y agrega la figura correspondiente con los valores indicados
     */

    public Figura[] agregarObjetoManualmente(String inicial, double radio, double altura, double base, Figura[] figuras) {

        int indiceVacio = verificarEspacioVacio(figuras);

        if (indiceVacio == -1) {
            Figura[] figurasAux = agrandarVector(figuras);
            return crearFigura(figurasAux, figurasAux.length - 1, inicial, radio, base, altura);

        }
        return crearFigura(figuras, indiceVacio, inicial, radio, base, altura);
    }

    /**
     * Pre:
     * recibe como @param figuras
     * Post:
     * Lista las figuras recibidas con sus detalles
     */
    public void listarObjetos(Figura[] figuras) {

        System.out.println("");

        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                System.out.println(figuras[i].mostrar());
            }
        }

        System.out.println("");
    }

    /**
     * Pre:
     * recibido el @param figuras
     * Post:
     * Retorna el valor de la figura con superficie maxima
     */

    public void indicarSuperficieMaxima(Figura[] figuras) {

        double superficieMaxima = 0;

        for (Figura figura : figuras) {
            if (figura != null && figura.getSuperficie() > superficieMaxima) {
                superficieMaxima = figura.getSuperficie();
            }
        }
        System.out.println("La superficie maxima es de : " + superficieMaxima + "\n");
    }


    /**
     * Pre:
     * recibido el @param figuras
     * Post:
     * Retorna el valor de la figura con superficie minima
     */
    public void indicarSuperficieMinima(Figura[] figuras) {
        //Arbitrariamente asigno el primero no null como el mayor. Definir manejo de excepciones
        double superficieMinima = -1;
        for (Figura f : figuras) {
            if (f != null) {
                superficieMinima = f.getSuperficie();
            }
        }

        for (Figura figura : figuras) {
            if (figura != null && figura.getSuperficie() < superficieMinima) {
                superficieMinima = figura.getSuperficie();
            }
        }
        System.out.println("La superficie minima es de : " + superficieMinima + "\n");
    }

    /**
     * Post: finaliza la app
     */
    public void salir() {
        System.out.println("Gracias por utilizar la aplicacion de figuras. Hasta luego! ");
        System.out.println(" ");
        System.exit(0);
    }

    /*
        Pre: Se brinda un vector de figuras
        Post: se retorna el indice vacio. En caso de no encontrar alguno, retorna -1
     */

    /**
     * Pre:
     * recibe como @param figuras
     * Post:
     *
     * @return el indiceVacio donde -1 indica que no hay ninguno vacio
     */
    public int verificarEspacioVacio(Figura[] figuras) {
        int indiceVacio = -1;
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] == null) {
                indiceVacio = i;
                //break;
                return indiceVacio;
            }
        }
        return indiceVacio;
    }

    /**
     * Pre:
     * recibe el @param figuras
     * Post:
     *
     * @return retorna un nuevo vector con mayor dimension (1) y con los valores del vector original incluidos
     */

    public Figura[] agrandarVector(Figura[] figuras) {
        Figura[] figurasAux = new Figura[figuras.length + 1];

        for (int a = 0; a < figuras.length; a++) {
            figurasAux[a] = figuras[a];
        }

        return figurasAux;
    }


    /**
     * Pre:
     * recibidos los param
     *
     * @param figuras
     * @param indice
     * @param inicial
     * @param radio
     * @param base
     * @param altura  Post:
     * @return la lista de figuras donde se añade la figura deseada en la posicion indicada
     */

    public Figura[] crearFigura(Figura[] figuras, int indice, String inicial, double radio, double base, double altura) {

        if (inicial.equals("T")) {
            Triangulo tri = new Triangulo(base, altura);
            figuras[indice] = tri;
        }

        if (inicial.equals("R")) {
            Rectangulo re = new Rectangulo(base, altura);
            figuras[indice] = re;
        }

        if (inicial.equals("C")) {
            Circulo ci = new Circulo(radio);
            figuras[indice] = ci;
        }
        return figuras;
    }


    /**
     * Pre:
     * recibidos los param
     *
     * @param opcion
     * @param figuras Post:
     * @return retorna lo referente a la opcion seleccionada
     */
    public Figura[] seleccionarOpcion(int opcion, Figura[] figuras) {
        Scanner scanner = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la posición que quiere consultar: \n");
                int p1 = scanner.nextInt() - 1;
                consultarPosicion(p1, figuras);
                System.out.println("\n");
                mostrarOpciones();
                break;
            case 2:
                System.out.println("Ingrese la posicion a eliminar: \n");
                int p2 = scanner.nextInt() - 1;
                darDeBajaObjeto(p2, figuras);
                mostrarOpciones();
                break;
            case 3:
                System.out.println("Indique el tipo de objeto a agregar manualmente.\n");
                System.out.println("1-Circulo \n");
                System.out.println("2-Rectangulo \n");
                System.out.println("3-Triangulo \n");
                System.out.println("<<<<<--->>>>> NO se permiten numeros con punto. Por ejemplo: 15.5 <<<<<--->>>>> \n");
                int p3 = scanner.nextInt();

                switch (p3) {
                    case 1:
                        System.out.println("Ingrese radio del circulo: \n");
                        double radio = scanner.nextDouble();
                        figuras = agregarObjetoManualmente("C", radio, 0, 0, figuras);
                        System.out.println("Figura agregada exitosamente \n");
                        break;
                    case 2:
                        System.out.println("Ingrese base del rectangulo: \n");
                        double baseRectangulo = scanner.nextDouble();
                        System.out.println("Ingrese altura del rectangulo: \n");
                        double alturaRectangulo = scanner.nextDouble();
                        figuras = agregarObjetoManualmente("R", 0, baseRectangulo, alturaRectangulo, figuras);

                        System.out.println("Figura agregada exitosamente \n");
                        break;
                    case 3:
                        System.out.println("Ingrese base del triangulo: \n");
                        double baseTriangulo = scanner.nextDouble();
                        System.out.println("Ingrese altura del triangulo: \n");
                        double alturaTriangulo = scanner.nextDouble();
                        figuras = agregarObjetoManualmente("T", 0, baseTriangulo, alturaTriangulo, figuras);
                        System.out.println("Figura agregada exitosamente \n");
                        break;
                    default:
                        System.out.println("Opcion invalida. Volviendo al menu ppal\n");
                        mostrarOpciones();
                        break;
                }
                mostrarOpciones();
                break;
            case 4:
                System.out.println("Objetos creados: ");
                listarObjetos(figuras);
                mostrarOpciones();
                break;
            case 5:
                System.out.println("El objeto con superficie maxima es: \n");
                indicarSuperficieMaxima(figuras);
                mostrarOpciones();
                break;
            case 6:
                System.out.println("El objeto con superficie minima es: \n");
                indicarSuperficieMinima(figuras);
                mostrarOpciones();
                break;
            case 7:
                salir();
                break;
            default:
                mostrarOpciones();
                break;
        }
        return figuras;
    }

}
