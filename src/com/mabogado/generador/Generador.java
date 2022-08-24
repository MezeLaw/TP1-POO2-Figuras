package com.mabogado.generador;

import com.mabogado.figuras.Figura;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Generador {

    public Figura[] generarFigurasDesdeArchivo(String fileName) throws IOException {

        Figura[] figuras;

        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        System.out.println("Read text file using Scanner");
        int tamanoVector = scanner.nextInt();

        figuras = new Figura[tamanoVector];

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();

            System.out.println(line);
        }

        scanner.close();

        return figuras;
    }
}
