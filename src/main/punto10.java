package main;

public class punto10 {
    public static void run() {
        /*PUNTO 10  Crea un programa que muestre los primeros 20 números de la serie Fibonacci. 
        La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente 
        número: 0, 1, 1, 2, 3, 5, 8, 13, …*/
        
        System.out.println("\u001B[35mPUNTO 10____________________\u001B[0m");
                
        int n1 = 0, n2 = 1, n3, i, count = 20;

        // Imprime los primeros dos números de la serie
        System.out.print("Los primeros 20 números de la serie Fibonacci son: "); 
        System.out.print(n1 + " " + n2); 
        
        // Inicia el bucle actualizando n1 y n2 a los dos últimos números de la serie
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
