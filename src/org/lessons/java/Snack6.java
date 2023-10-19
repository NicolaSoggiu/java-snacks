package org.lessons.java;

import java.util.Scanner;

public class Snack6 {

    /**
     * Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi;
     * e mostri a video la stringa generata (secondi → “hh:mm:ss”)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci i secondi che vuoi convertire: ");
        // secondi da convertire
        int initialSeconds = scan.nextInt();

        // calcolo
        int hours = initialSeconds / 3600;
        initialSeconds %= 3600;
        int minutes = initialSeconds / 60;
        int seconds = initialSeconds % 60;

        // metto tutto in una stringa
        String convertedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        // stampo il risultato
        System.out.println("Tempo convertito: " + convertedTime);
    }
}
