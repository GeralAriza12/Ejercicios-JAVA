package main;

import java.util.Scanner;

public class punto7 {
    public static void run() {
        /*PUNTO 7 Crea un programa que pida al usuario un número entero positivo 
        y muestre su tabla de multiplicar hasta el 10*/
        
        System.out.println("\u001B[35mPUNTO 7____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);

        System.out.println("¿Quieres saber la tabla del número?");
        int tabla = input.nextInt();

        if (tabla < 0) {
            System.out.println("El número que ingresaste debe ser positivo");
        } else {
            for(int i = 1; i <= 10; i++){
                System.out.println(tabla + " * " + i + " = " + tabla * i);
            }
        }
    }
}
