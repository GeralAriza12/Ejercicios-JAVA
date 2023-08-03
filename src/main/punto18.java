package main;

import java.util.Random;

public class punto18 {
    public static void run() {
        /*PUNTO 18 Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, 
        letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y la clase String 
        para manipular la contraseña.*/
        
        System.out.println("\u001B[35mPUNTO 18____________________\u001B[0m");
                
        // Definir los caracteres permitidos para la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Crear instancia de la clase Random
        Random random2 = new Random();

        // Crear una cadena vacía para almacenar la contraseña generada
        String password = "";

        // Generar 8 caracteres para la contraseña
        for (int i = 0; i < 8; i++) {
            // Obtener un índice aleatorio para seleccionar un carácter de la cadena
            int indice = random2.nextInt(caracteres.length());

            // Obtener el carácter correspondiente al índice aleatorio
            char caracter = caracteres.charAt(indice);

            // Agregar el carácter a la contraseña generada
            password += caracter;
        }

        System.out.println("Contraseña generada: " + password);
    }
}
