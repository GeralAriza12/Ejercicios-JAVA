package main;

import java.util.Scanner;

public class punto19 {
    public static void run() {
        /*PUNTO 19 Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas */
        
        System.out.println("\u001B[35mPUNTO 19____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre:");
        String nombre = input.nextLine();

        String nombreMayus = nombre.toUpperCase();

        System.out.println(nombreMayus);

        String nombreMinus = nombre.toLowerCase();

        System.out.println(nombreMinus);
    }
}
