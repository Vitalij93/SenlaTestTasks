package com.yaroshuk;

import com.yaroshuk.core.WordProcessor;
import com.yaroshuk.core.impl.WordProcessorImp;
import com.yaroshuk.io.Input;
import com.yaroshuk.io.Output;
import com.yaroshuk.io.impl.ConsoleInputImp;
import com.yaroshuk.io.impl.ConsoleOutputImp;

import java.io.IOException;

public class Main {

    private static final WordProcessor wordProcessor = new WordProcessorImp();
    private static final Input inputProcessor = new ConsoleInputImp();
    private static final Output outputProcessor = new ConsoleOutputImp();

    public static void main(String[] args) {
        System.out.print("Please enter string : ");
        try {
            String input = inputProcessor.readInput();
            if(input == null || 0 == input.length()){
                System.out.println("Sorry, we cannot work with empty string :-(");
                System.exit(0);
            }
            outputProcessor.writeResult(wordProcessor.processInputString(input));
        } catch (IOException e) {
            System.out.println("Could not process input string. Reason : " + e.getMessage());
        }
    }
}
