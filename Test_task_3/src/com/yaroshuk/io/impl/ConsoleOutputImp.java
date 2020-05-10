package com.yaroshuk.io.impl;


import com.yaroshuk.io.Output;

public class ConsoleOutputImp implements Output {

    @Override
    public void writeResult(String result) {
        System.out.println(result);
    }
}