package main;

import java.util.Scanner;

public class punto16 {
    public static void run() {
        /*PUNTO 16 Realiza un programa que calcule e imprima la serie de Fibonacci 
        hasta un número dado ingresado por el usuario. */
        
        System.out.println("\u001B[35mPUNTO 16____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo para una serie Fibonacci:");
        int numFibonacci = input.nextInt();
        
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print(firstNumber + " ");

        while (secondNumber < numFibonacci) {
            System.out.print(secondNumber + " ");
            
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

        System.out.println("Serie de Fibonacci hasta: " + numFibonacci);
    }
}
