package com.yaroshuk.core.impl;

import com.yaroshuk.core.WordProcessor;

import java.util.Map;
import java.util.TreeMap;

public class WordProcessorImp implements WordProcessor {

    private final static String DELIMITER = " ";

    @Override
    public String processInputString(String inputString) {
        Map<String, Integer> wordCounter = new TreeMap<>();
        String[] splittedString = inputString.split(DELIMITER);
        for (String key : splittedString) {
            String capitalizedKey = capitalizeString(key);
            Integer currentCount = wordCounter.getOrDefault(capitalizedKey, 0);
            currentCount = currentCount + 1;
            wordCounter.put(capitalizedKey, currentCount);
        }
        return buildResultString(wordCounter);
    }

    private String capitalizeString(String source){
        return  source.substring(0, 1).toUpperCase() + source.substring(1);
    }

    private String buildResultString(Map<String, Integer> wordsMap){
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            final String word = entry.getKey();
            final Integer count = entry.getValue();
            builder.append(word).append(" - ").append(count);
            builder.append("\n");
        }
        return builder.toString();
    }
}