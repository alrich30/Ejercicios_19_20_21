package org.example;

/**
 * En este ejercicio cree un método que devuelve una tabla de multiplicación de un número que proporcionemos en el main.
 * Cambiándole los valores int en los parámetros podemos hacer que multiplique hasta donde queramos dicho número.
 */
public class Ejercicio19 {
    public static void main(String[] args) {

        multiplicadorDeNumeros(8, args);

    }
    public static void multiplicadorDeNumeros(int numero, String[]args) {

        int minMultiplicatorValue = Integer.parseInt(args[0]);
        int maxMultiplicatorValue = Integer.parseInt(args[1]);


        for (int i = minMultiplicatorValue; i <= maxMultiplicatorValue; i++) {
            System.out.println(numero * i);
        }
    }
}