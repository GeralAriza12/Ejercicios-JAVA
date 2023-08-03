package main;

import java.util.Scanner;

public class punto15 {
    public static void run() {
        /*PUNTO 15 Crea un programa que pida al usuario un número entero y determine si es un número capicúa. 
        Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda. */
        
        System.out.println("\u001B[35mPUNTO 15____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero positivo para saber si es capicúa:");
        int numCapicua = input.nextInt();
        
        int reversedNumber = 0;
        int originalNumber = numCapicua;
            
        while (numCapicua != 0) {
            int digit = numCapicua % 10;
            reversedNumber = reversedNumber * 10 + digit;
            numCapicua /= 10;
        }
        
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " es un capicúa");
        } else {
            System.out.println(originalNumber + " no es un capicúa");
        }
    }
}
