package main;

import java.util.Arrays;
import java.util.HashSet;

public class punto30 {
    public static void run() {
        /*PUNTO 30 Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo. */

        System.out.println("\u001B[35mPUNTO 30____________________\u001B[0m");

        int[] arr = {1, 2, 78, 5, 2, 10, 10};

        // Convertir el arreglo en un conjunto para eliminar los duplicados
        HashSet<Integer> conjunto = new HashSet<>();
        for (int elemento : arr) {
            conjunto.add(elemento);
        }

        // Convertir el conjunto en un nuevo arreglo sin duplicados
        int[] arregloSinDuplicados = new int[conjunto.size()];
        int indice = 0;
        for (int elemento : conjunto) {
            arregloSinDuplicados[indice++] = elemento;
        }

        System.out.println("Así estaba el array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Arreglo sin duplicados: " + Arrays.toString(arregloSinDuplicados));
    }
}
