package main;

import java.util.Scanner;

public class punto12 {
    public static void run() {
        /*PUNTO 12 Realiza un programa que pida al usuario un número entero 
        y determine si es un número primo o no */
        
        System.out.println("\u001B[35mPUNTO 12____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un número para determinar si es primo:");
        int numPrimo = input.nextInt();

        boolean esPrimo = true;

        if (numPrimo <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numPrimo); i++) {
                if (numPrimo % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numPrimo + " es un número primo. Bye");
        } else {
            System.out.println(numPrimo + " no es un número primo. Bye");
        }
    }
}
