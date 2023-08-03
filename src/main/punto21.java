package main;

import java.util.Scanner;

public class punto21 {
    public static void run() {
        /*PUNTO 21 Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella */
        
        System.out.println("\u001B[35mPUNTO 21____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tu texto para encontrar un letra específica:");
        String texto = input.nextLine();

        System.out.println("¿Qué letra quieres encontrar?");
        char letra = input.nextLine().charAt(0);

        int countLetra = 0;

        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == letra) {
                countLetra++;
            }
        }

        System.out.println("La latra " + letra + " se encuentra " + countLetra + " veces");
    }
}
