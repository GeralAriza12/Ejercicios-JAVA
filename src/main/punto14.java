package main;

import java.util.Scanner;

public class punto14 {
    public static void run() {
        /*PUNTO 14 Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. 
        Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número*/
        
        System.out.println("\u001B[35mPUNTO 14____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero positivo para determinar si es perfecto:");
        int numPerfecto = input.nextInt();

        int sumaDivisores = 0;

        for (int i = 1; i < numPerfecto; i++) {
            if (numPerfecto % i == 0) {
                sumaDivisores += i;
            }
        }

        if (sumaDivisores == numPerfecto) {
            System.out.println(numPerfecto + " es un número perfecto");
        } else {
            System.out.println(numPerfecto + " no es un número perfecto");
        }
    }
}
