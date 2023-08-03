package main;

public class punto28 {
    public static void run() {
        /*PUNTO 28  Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros*/
        
        System.out.println("\u001B[35mPUNTO 28____________________\u001B[0m");
        
        int[] arr = {1, 2, 3, 4, 5};

        int suma = 0;

        // Recorrer el arreglo y sumar cada elemento
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }

        System.out.println("Así es el elemento " + arr);
        System.out.println("La suma de los elementos es: " + suma);
    }
}
