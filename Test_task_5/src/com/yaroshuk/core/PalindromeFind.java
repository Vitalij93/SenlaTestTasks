package com.yaroshuk.core;

import java.util.ArrayList;
import java.util.List;

public class PalindromeFind implements PalindromeFindInterface {

    public List<String> getPalindromes(int range){
        List<String> result = new ArrayList<>();
        for(int i = 0; i <= range; i++){
            final String intString = String.valueOf(i);
            final String reversedString = reverse(intString);
            if(reversedString.equals(intString)){
                result.add(intString);
            }
        }
        return result;

    }

    private String reverse(String source){
        StringBuilder builder = new StringBuilder();
        builder.append(source);
        builder.reverse();
        return builder.toString();
    }
}
