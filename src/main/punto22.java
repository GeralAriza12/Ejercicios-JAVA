package main;

import java.util.Scanner;

public class punto22 {
    public static void run() {
        /*PUNTO 22 Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo 
        (se lee igual de izquierda a derecha que de derecha a izquierda)  */
        
        System.out.println("\u001B[35mPUNTO 22____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una posible frase palíndromo:");
        String palindrome = input.nextLine();

        // Para que compare las letras y no los espacios
        String quitarEspacios = palindrome.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int inicio = 0;
        int fin = quitarEspacios.length() -1;

        while (inicio < fin) {
            if (quitarEspacios.charAt(inicio) != quitarEspacios.charAt(fin)) {
                isPalindrome = false;
                break;
            }
            inicio++;
            fin--;
        }

        if (isPalindrome) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }
}
