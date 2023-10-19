package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack2 {

    /**
     * Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi;
     * E da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
     */

    public static void main(String[] args) {
        // creo la classe random
        Random rand = new Random();

        // creo un array per i nomi e uno per i cognomi
        String[] firstName = {"Nicola", "Francesco", "Roberto", "Vincenzo", "Andrea", "Filippo", "Gabriele", "Luca"};
        String[] lastName = {"Rossi", "Bianchi", "Conti", "Soggiu", "Esposito", "Mancini", "Fontana", "Meloni"};

        // itero fino a quando i raggiunge la lunghezza dell'array dei nomi
        for (int i = 0; i < firstName.length; i++) {

            // genero due numeri casuali per usarli come indici per accedere agli elementi degli array
            int randomFirstName = rand.nextInt(firstName.length);
            int randomLastName = rand.nextInt(lastName.length);

            // utilizzando i numeri casuali estraggo un nome e un cognome
            String newFirstName = firstName[randomFirstName];
            String newLastName = lastName[randomLastName];

            // stampo il risultato
            System.out.println(newFirstName + " " + newLastName);
        }
    }
}
