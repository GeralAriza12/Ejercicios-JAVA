package main;

public class punto35 {
    public static void run() {
        /*PUNTO 35 Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al  10. 
        Usa para esto una matriz */
        
        System.out.println("\u001B[35mPUNTO 35____________________\u001B[0m");

        System.out.println("Estas son las tablas de 1 al 10");
        int[][] multiplicationMatrix = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationMatrix[i][j] = (i + 1) * (j + 1);
            }
        }

        // Imprimir las tablas de multiplicar
        for (int i = 0; i < 10; i++) {
            System.out.println("\u001B[33mMultiplication Table for: \u001B[0m" + (i + 1));
            
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 1) + " * " + (j + 1) + " = " + multiplicationMatrix[i][j]);
            }
            
            System.out.println();
        }
        
        System.out.println("\u001B[35m__________FIN DEL TALLER__________\u001B[0m");
    }
}
