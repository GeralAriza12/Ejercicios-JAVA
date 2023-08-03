package main;

public class punto31 {
    public static void run() {
        /*PUNTO 31 Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo, el algoritmo de 
        burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente */

        System.out.println("\u001B[35mPUNTO 31____________________\u001B[0m");

        int[] arr = {0, 5, 1, 2, 8, 3, 4, 6, 7};

        System.out.println("Ordenemos este array");
        System.out.println("Así estaba el array:");
        for (int c = 0; c < arr.length; c++) {
            System.out.print(arr[c] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - j - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Así quedo el array:");
        for (int d = 0; d < arr.length; d++) {
            System.out.print(arr[d] + " ");
        }
        
    }
}
