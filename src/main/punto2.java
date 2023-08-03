package main;

import java.util.Scanner;

public class punto2 {
    public static void run() {
        // /*PUNTO 2 Escribe un programa que pida al usuario un número entero 
        // y determine si es par o impar */

        System.out.println("\u001B[35mPUNTO 2____________________\u001B[0m");

        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un número para saber si es par o impar:");
        int isNum = input.nextInt();

        if (isNum % 2 == 0) {
            System.out.println(isNum + " Es par");
        } else {
            System.out.println(isNum + " Es impar");
        }
    }
}
