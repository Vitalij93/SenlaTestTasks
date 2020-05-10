package com.yaroshuk;

import com.yaroshuk.number.NumberTypeInterface;
import com.yaroshuk.number.NumberType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please enter number : ");
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            String input = reader.readLine().trim();

            try {
                final int inputInt = Integer.parseInt(input);
                NumberTypeInterface numberTypeInterface = new NumberType(inputInt);
                if (numberTypeInterface.isEven()) {
                    System.out.println("Even number.");
                } else {
                    System.out.println("Оdd number.");
                }
                if (numberTypeInterface.isComposite()) {
                    System.out.println("Composite number.");
                } else {
                    System.out.println("Prime number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect number!");
                System.exit(0);
            }


            System.out.println();
        } catch (IOException e) {
            System.out.println("Could not process input string. Reason : " + e.getMessage());
        }
    }
}
