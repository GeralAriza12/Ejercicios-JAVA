package main;

import java.util.Scanner;

public class punto26 {
    public static void run() {
        /*PUNTO 26 Escribe un programa que pida al usuario una cadena y muestre cuántos 
        caracteres tiene sin contar los espacios en blanco  */
        
        System.out.println("\u001B[35mPUNTO 26____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escribe un texto para saber cuantos caracteres tiene:");
        String texto4 = input.nextLine();

        String quitarEspacios = texto4.replaceAll("\\s+", "").toLowerCase();

        int countCaracteres = quitarEspacios.length();

        System.out.println("Esa cadena tiene: " + countCaracteres + " caracteres");
    }
}
