package main;

import java.util.Scanner;

public class punto1 {
    public static void run() {
        /*PUNTO 1 Realiza un programa que solicite al usuario dos números enteros 
        y muestre su suma, resta, multiplicación y división */

        // Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        System.out.println("PUNTO 1____________________\u001B[0m");

        System.out.println("Ingresa número entero para operaciones:");
        int num1 = input.nextInt();

        System.out.println("Ingresa número entero para opraciones:");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int res = num1 - num2;
        int mul = num1 * num2;

        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + res);
        System.out.println("La multiplicación es: " + mul);
        if (num2 != 0) {
            System.out.println("La división es: " + ((double)num1 / num2));
        } else {
            System.out.println("No se puede dividir por 0");
        }
    }
}
