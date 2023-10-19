package org.lessons.java;

import java.util.Scanner;

public class Snack4 {

    /**
     * Data in input una stringa verificare se è palindroma
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una parola e scopri se è palindroma!");
        String word = scan.nextLine();

        char[] chars = word.toCharArray();
        boolean isPalindrome = true;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("La parola " + word +" è palindroma!");
        } else {
            System.out.println("La parola non è palindroma!");
        }
        scan.close();
    }
}