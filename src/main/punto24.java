package main;

import java.util.Scanner;

public class punto24 {
    public static void run() {
        /*PUNTO 24 Realiza un programa que solicite al usuario una cadena y reemplace 
        todas las apariciones de una letra específica por otra */
        
        System.out.println("\u001B[35mPUNTO 24____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escribe un texto para cambiar una letra:");
        String texto2 = input.nextLine();

        System.out.println("¿Qué letra quieres cambiar?");
        char selectLetra = input.nextLine().charAt(0);

        System.out.println("¿por cúal letra cambiariamos " + selectLetra + "?");
        char changeLetra = input.nextLine().charAt(0);

        String texto2Modificado = texto2.replace(selectLetra, changeLetra);

        System.out.println("Así quedo el texto:" + texto2Modificado);
    }
}
