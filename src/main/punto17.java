package main;

import java.util.Scanner;

public class punto17 {
    public static void run() {
        /*PUNTO 17 Pide al usuario dos números enteros y muestra todos los números 
        primos que se encuentran en ese rango. */
        
        System.out.println("\u001B[35mPUNTO 17____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Determinemos el rango de dos números primos");
        System.out.println("Ingrese un entero:");
        int numEntero1 = input.nextInt();

        System.out.println("Ingrese otro entero mayor al anterior:");
        int numEntero2 = input.nextInt();

        System.out.println("Los numeros primos entre " + numEntero1 + " y " + numEntero2 + " son:");
        
        for (int number = numEntero1; number <= numEntero2; number++) {
            if (number <= 1) {
                continue;
            }
            
            boolean isPrime = true;
            
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
