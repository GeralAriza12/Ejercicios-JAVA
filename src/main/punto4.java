package main;

import java.util.Scanner;

public class punto4 {
    public static void run() {
        /*PUNTO 4 Pide al usuario su edad y muestra un mensaje 
        indicando si es mayor de edad o menor de edad. */

        System.out.println("\u001B[35mPUNTO 4____________________\u001B[0m");

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad:");
        int edad = input.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Aun eres menor de edad");
        }
    }
}
