package main;

import java.util.Scanner;

public class punto25 {
    public static void run() {
        /*PUNTO 25 Pide al usuario una frase y muestra cada palabra por separado */
        
        System.out.println("\u001B[35mPUNTO 25____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escribe un texto para separar:");
        String texto3 = input.nextLine();

        String[] separar = texto3.split(" ");

        System.out.println("Así quedo el texto:");
        // Recorrer cada palabra e imprimirla
        for (String separa : separar) {
            System.out.println("- " + separa);
        }
    }
}
