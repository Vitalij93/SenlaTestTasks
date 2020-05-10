package com.yaroshuk;

import com.yaroshuk.core.GcdLcm;
import com.yaroshuk.core.GcdLcmInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter the first number: ");
            String firstNum = reader.readLine().trim();
            System.out.print("Enter the second number: ");
            String secondNum = reader.readLine().trim();
           try {
               final int aInt = Integer.parseInt(firstNum);
               final int bInt = Integer.parseInt(secondNum);
               GcdLcmInterface gcdLcm = new GcdLcm(aInt,bInt);
               System.out.print("Gcd - ");
               System.out.println(gcdLcm.gcd());
               System.out.print("Lcm - ");
               System.out.println(gcdLcm.lcm());

           }
               catch (NumberFormatException e) {
                System.out.println("Incorrect number!");
                System.exit(0);
            }



            System.out.println();
        }
        catch (IOException e) {
            System.out.println("Could not process input string. Reason : " + e.getMessage());
        }

    }


}
