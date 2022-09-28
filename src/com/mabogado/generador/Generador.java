package com.mabogado.generador;

import com.mabogado.figuras.Circulo;
import com.mabogado.figuras.Figura;
import com.mabogado.figuras.Rectangulo;
import com.mabogado.figuras.Triangulo;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Generador {
    /**
     * @param fileName
     * @return retorna el vector de figuras en base al archivo
     * @throws IOException
     */
    public Figura[] generarFigurasDesdeArchivo(String fileName) throws IOException {

        Figura[] figuras;

        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);

        String tamanoVectorStr = scanner.nextLine();
        int tamanoVector = Integer.valueOf(tamanoVectorStr);

        figuras = new Figura[tamanoVector];

        for (int i = 0; i < tamanoVector; i++) {
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                figuras[i] = construirFigura(line);
            }
        }

        scanner.close();

        return figuras;
    }

    /**
     * @param linea -
     * @return figura en base a la linea ingresada
     */
    public Figura construirFigura(String linea) {

        String[] lineaDesestructurada = linea.split("\\s+");

        //Asumo que es un el archivo siempre vendra bien y no verifico el size del string, paso directo a la inicial
        String inicial = lineaDesestructurada[0];

        double base = 0;
        double altura = 0;
        double radio = 0;

        switch (inicial) {
            case "T":
                base = Double.valueOf(lineaDesestructurada[1]);
                altura = Double.valueOf(lineaDesestructurada[2]);
                return new Triangulo(base, altura);
            case "R":
                base = Double.valueOf(lineaDesestructurada[1]);
                altura = Double.valueOf(lineaDesestructurada[2]);
                return new Rectangulo(base, altura);
            default:
                radio = Double.valueOf(lineaDesestructurada[1]);
                return new Circulo(radio);
        }
    }
}
