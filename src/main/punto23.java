package main;

import java.util.Scanner;

public class punto23 {
    public static void run() {
        /*PUNTO 23 Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene */
        
        System.out.println("\u001B[35mPUNTO 23____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Cuantas palabras hay en? (Escribe el texto):");
        String palabras = input.nextLine();

        // Convierto el texto en un array serapandolo por los " " para poder recorrerlo
        String[] howManyPalabras = palabras.split(" ");

        int countPalabras = howManyPalabras.length;

        System.out.println("Tú frase tiene " + countPalabras + " palabras");
    }
}
