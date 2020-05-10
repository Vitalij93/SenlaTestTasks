package com.yaroshuk.io.impl;

import com.yaroshuk.io.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputImp implements Input {

    @Override
    public String readInput() throws IOException {
        try(BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in))){
            return reader.readLine().trim();
        }
    }
}