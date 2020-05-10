package com.yaroshuk;

import com.yaroshuk.core.PalindromeFind;
import com.yaroshuk.core.PalindromeFindInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    private static final PalindromeFindInterface palindrome = new PalindromeFind();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Please enter N : ");
            String n = reader.readLine().trim();

            if (0 == n.length()) {
                System.out.println("Sorry, number entered incorrectly :-(");
                System.exit(0);
            }
            try {
                final int nInt = Integer.parseInt(n);

                if (nInt <= 0 || nInt >= 100) {
                    System.out.println("Sorry, number should be more then 0 and less 100");
                    System.exit(0);
                }
                List<String> result = palindrome.getPalindromes(nInt);
                for (String s : result) {
                    System.out.println(s);
                }
            }catch (NumberFormatException e) {
                System.out.println("Incorrect number!");
                System.exit(0);
            }
        }
        catch (IOException e) {
            System.out.println("Could not process input string. Reason : " + e.getMessage());
        }


    }
}
