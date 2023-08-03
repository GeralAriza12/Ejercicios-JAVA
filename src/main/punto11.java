package main;

import java.util.Scanner;

public class punto11 {
    public static void run() {
        /*PUNTO 11 Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. 
        El usuario debe ingresar las longitudes de los tres lados */
        
        System.out.println("\u001B[35mPUNTO 11____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calcule el área de un triángulo");
        System.out.println("Lado (a)");
        double lado1 = input.nextDouble();

        System.out.println("Lado (b)");
        double lado2 = input.nextDouble();

        System.out.println("Lado (c)");
        double lado3 = input.nextDouble();

        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area2 = Math.sqrt(
            semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3)
        );

        System.out.println("El área del triángulo es: " + area2);
    }
}
