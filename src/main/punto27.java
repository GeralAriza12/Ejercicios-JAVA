package main;

import java.util.Arrays;
import java.util.Scanner;

public class punto27 {
    public static void run() {
        /*PUNTO 27 Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente */
        
        System.out.println("\u001B[35mPUNTO 27____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escribe un texto para ordenar alfabéticamente:");
        String texto5 = input.nextLine();

        String[] ordenar = texto5.toLowerCase().split(" ");

        Arrays.sort(ordenar);

        System.out.println("Aquí esta el texto ordenado alfabéticamente:");

        for(String orden : ordenar){
            System.out.println(orden);
        }
    }
}
