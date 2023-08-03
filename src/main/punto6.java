package main;

import java.util.Scanner;

public class punto6 {
    public static void run() {
        /*PUNTO 6 Escribe un programa que pida al usuario un número 
        y verifique si es positivo, negativo o cero. */

        System.out.println("\u001B[35mPUNTO 6____________________\u001B[0m");

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un número para verificar:");
        int numero = input.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
    }
}
