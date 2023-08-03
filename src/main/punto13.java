package main;

import java.util.Scanner;

public class punto13 {
    public static void run() {
        /*PUNTO 13 Pide al usuario un número decimal y muestra su valor redondeado 
        a un número específico de decimales  */
        
        System.out.println("\u001B[35mPUNTO 13____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un número decimal:");
        double numDecimal = input.nextDouble();

        System.out.println("Ingrese el número de decimales a los que desea redondear:");
        int decimales = input.nextInt();

        double factor = Math.pow(10, decimales);
        double numeroRedondeado = Math.round(numDecimal * factor) / factor;

        System.out.println("El número redondeado es: " + numeroRedondeado);
    }
}
