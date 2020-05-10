package com.yaroshuk;

import com.yaroshuk.core.WordCount;
import com.yaroshuk.core.WordСountInterface;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final WordСountInterface wordCount = new WordCount();



    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Please enter text : ");
            String inputText = reader.readLine().trim();
            System.out.print("Please enter word : ");
            String inputWord = reader.readLine().trim();

            if(inputText == null || 0 == inputText.length()){
                System.out.println("Sorry, we cannot work with empty string :-(");
                System.exit(0);
            }
            if(inputWord == null || 0 == inputWord.length()){
                System.out.println("Sorry, word not entered :-(");
                System.exit(0);
            }
            int result = wordCount.wordCount(inputText,inputWord);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Could not process input string. Reason : " + e.getMessage());
        }
    }
}
