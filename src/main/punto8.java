package main;

import java.util.Random;
import java.util.Scanner;

public class punto8 {
    public static void run() {
        /*PUNTO 8 Realiza un programa que simule un juego de adivinar un número. 
        El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. 
        El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar */
        
        System.out.println("\u001B[35mPUNTO 8____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1;
        int numeroUsuario = 0;

        while (numeroUsuario != numeroAleatorio) {
            System.out.println("Adivina un número entre 1 y 100:");
            numeroUsuario = input.nextInt();

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("Aún no adivinas, el número es Mayor");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("Aún no adivinas, el número es Menor");
            }
        }

        System.out.println("¡Felicidades! El número era: " + numeroAleatorio);
    }
}
