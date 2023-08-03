package main;

public class punto29 {
    public static void run() {
        /*PUNTO 29 Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros */
        
        System.out.println("\u001B[35mPUNTO 29____________________\u001B[0m");
        
        int[] arr = {11, 12, 53, 84, 45};

        int numMayor = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (arr[i] > numMayor) {
                numMayor = arr[i];
            }
        }

        System.out.println("Así estaba el array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("El número más grande es: " + numMayor);
    }
}
