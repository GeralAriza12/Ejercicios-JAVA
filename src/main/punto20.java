package main;

import java.util.Scanner;

public class punto20 {
    public static void run() {
        /*PUNTO 20 Realiza un programa que solicite al usuario una cadena y luego invierta su orden */
        
        System.out.println("\u001B[35mPUNTO 20____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un texto para invertir:");
        String cadena = input.nextLine();

        // El método StringBuilder().reverse() hace invertir el string
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();

        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}
