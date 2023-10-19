package org.lessons.java;

public class Snack3 {
    /**
     * Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
     */

    public static void main(String[] args) {

        // creo un array di numeri interi
        int[] numbers = {3, 6, 5, 1, 30, 35, 123, 7, 65};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            // Controlla se l'indice è dispari e faccio la somma
            if (i % 2 == 1) {
                sum += numbers[i];
            }
        }

        System.out.println("Il totale dei numeri in posizione dispari è : " + sum);
    }
}

