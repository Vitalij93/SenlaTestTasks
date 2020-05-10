package com.yaroshuk.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount implements WordСountInterface {

    public WordCount() {
    }
    @Override
    public int wordCount(String text, String word) {
        int result = 0;
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            if(word.equalsIgnoreCase(matcher.group())){
                result++;
            }
        }
        return result;
    }
}
