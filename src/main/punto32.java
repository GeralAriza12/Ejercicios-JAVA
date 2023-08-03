package main;

import java.util.Scanner;

public class punto32 {
    public static void run() {
        /*PUNTO 32 Buscar un elemento: Escribe un programa que busque un número específico en un arreglo 
        y muestre su índice (o un mensaje si no se encuentra). */
        
        System.out.println("\u001B[35mPUNTO 32____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);
        
        int[] arreglo5 = {1, 2, 4, 7, 8, 9, 22};

        System.out.println("¿Que número deseas buscar?");
        int buscaNum = input.nextInt();

        int index = -1;

        for (int i = 0; i < arreglo5.length; i++) {
            if (arreglo5[i] == buscaNum) {
                index = i;
                break;
            }
        }

        if (index != -1 ) {
            System.out.println("El número " + buscaNum + " se encuentra en la posición: " + index);
        } else {
            System.out.println("El número NO se encuentra disponible");
        }
    }
}
