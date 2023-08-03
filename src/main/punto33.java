package main;

import java.util.HashMap;
import java.util.Map;

public class punto33 {
    public static void run() {
        /*PUNTO 33 Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo.*/

        System.out.println("\u001B[35mPUNTO 33____________________\u001B[0m");

        int[] arr = {1, 2, 4, 7, 8, 9, 22, 3, 4, 2, 2, 3};

        // Almacena los pares elemento-frecuencia
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Cuenta la frecuencia de cada elemento
        for (int element : arr) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1); // Incrementa el valor de la clave en 1
            } else {
                frequencyMap.put(element, 1);
            }
        }

        System.out.println("Así es el array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("El " + entry.getKey() + " aparece " + entry.getValue() + " veces(s)");
        }
    }
}
