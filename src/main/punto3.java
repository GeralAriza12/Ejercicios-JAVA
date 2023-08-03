package main;

import java.util.Scanner;

public class punto3 {
    public static void run() {
        /* PUNTO 3 Crea un programa que calcule y muestre el área y el perímetro de un círculo. 
        El usuario debe proporcionar el radio del círculo*/
        
        System.out.println("\u001B[35mPUNTO 3____________________\u001B[0m");

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo;");
        double radio = input.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área del circulo es: " + area);
        System.out.println("El perímetro del circulo es: " + perimetro);
    }
}
