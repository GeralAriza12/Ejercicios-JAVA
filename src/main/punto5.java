package main;

import java.util.Scanner;

public class punto5 {
    public static void run() {
         /*PUNTO 5 Realiza un programa que solicite al usuario dos números enteros 
        y determine cuál es el mayor de ellos. */

        System.out.println("\u001B[35mPUNTO 5____________________\u001B[0m");

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un número entero:");
        int num3 = input.nextInt();

        System.out.println("Ingresa otro número entero:");
        int num4 = input.nextInt();

        if (num3 > num4) {
            System.out.println( num3 + " Es mayor que " + num4);
        } else {
            System.out.println(num3 + " Es menor que " + num4);
        }
    }
}
