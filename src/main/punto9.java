package main;

import java.util.Scanner;

public class punto9 {
    public static void run() {
        /*PUNTO 9  Escribe un programa que solicite al usuario un número entero positivo 
        y calcule su factorial.*/
        
        System.out.println("\u001B[35mPUNTO 9____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un número para calcular su factorial:");
        int numFactorial = input.nextInt();

        if (numFactorial < 0) {
            System.out.println("El número que ingresaste debe ser positivo");
        } else {
            long factorial = 1;
            for (int i = 1; i <= numFactorial; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numFactorial + " es: " + factorial);
        }
    }
}
