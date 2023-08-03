package main;

import java.util.Arrays;
import java.util.Scanner;

public class punto34 {
    public static void run() {
        /*PUNTO 34 Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia la izquierda
        o la derecha una cierta cantidad de posiciones */   
        
        System.out.println("\u001B[35mPUNTO 34____________________\u001B[0m");
        
        Scanner input = new Scanner(System.in);

        System.out.print("Creemos un array, ¿De cuantos números será el array? ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Introduzca los números:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Rotara para la derecha o izquierda: ");
        String direction = input.next();
        System.out.print("Ingrese el número de posiciones a rotar: ");
        int positions = input.nextInt();

        int length = array.length;
        positions = positions % length;
        if (direction.equalsIgnoreCase("izquierda")) {
            for (int i = 0; i < positions; i++) {
                int temp = array[0];
                for (int j = 0; j < length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[length - 1] = temp;
            }
        } else if (direction.equalsIgnoreCase("derecha")) {
            for (int i = 0; i < positions; i++) {
                int temp = array[length - 1];
                for (int j = length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = temp;
            }
        } else {
            System.out.println("Invalid rotation direction!");
        }

        System.out.println("Array rotado: " + Arrays.toString(array));

        input.close();
    }
}
