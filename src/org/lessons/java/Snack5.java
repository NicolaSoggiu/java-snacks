package org.lessons.java;

public class Snack5 {

    /**
     * Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
     * Possibile usare solo :
     * cicli
     * chartAt
     * if / switch
     * Es. “25" come stringa deve essere convertito in intero 25.
     */

        public static void main(String[] args) {

            String numberStr = "123456789";
            int numberInt = 0;

            for (int i = 0; i < numberStr.length() ; i++) {
                char charNumber = numberStr.charAt(i);
                int convertedNumber = charNumber - '0';
                numberInt = numberInt * 10 + convertedNumber;
            }
            System.out.println(numberInt);
        }
    }
