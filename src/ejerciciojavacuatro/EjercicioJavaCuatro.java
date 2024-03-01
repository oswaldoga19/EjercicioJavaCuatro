/*
 * Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo
*/
package ejerciciojavacuatro;

import java.util.Scanner;


public class EjercicioJavaCuatro {

    public static void main(String[] args) {
       
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Por favor ingrese un número para sacarle el cubo y el cuadrado: ");
        double numero = scanner.nextDouble();

        // Calcular el cuadrado y el cubo
        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        // Mostrar los resultados
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);

    }
    
}
