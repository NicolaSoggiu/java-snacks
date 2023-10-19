package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    /**
     * Continua a chiedere all’utente di inserire un numero;
     * Se è pari stampa il numero, se è dispari stampa il numero successivo;
     * Se il numero è negativo termina.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci un numero: ");
            int number = scan.nextInt();
            if (number % 2 == 0) {
                System.out.println("Il numero " + number + " è pari.");
            } else if (number % 2 == 1 ) {
                System.out.println("Il numero " + number + " è dispari, stampo il numero seguente " + (number + 1));
            } else {
                    System.out.println("Hai inserito un numero negativo!");
                    break;
            }
        }
        scan.close();
    }
}
