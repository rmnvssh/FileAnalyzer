package com.company;
import java.util.HashMap;
import java.util.Map;

public class FileAnalyzer {
    private String str;
    private HashMap<Character, Integer> count_symbol;
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";


    public FileAnalyzer(String s){
        this.str = s;
        count_symbol = new HashMap<>();
    }

    public String getString() {
        return this.str;
    }


    public String getCountSymbolAsString() {
        String result = "";
        for (Map.Entry<Character, Integer> entry : count_symbol.entrySet())
            result += String.format("%s: %d\n", entry.getKey(), entry.getValue());
        return result;
    }

    private boolean in_alphabet(Character c){
        return ALPHABET.indexOf(c) != -1;
    }

    public void setCountSymbolMap(){
        for (int i = 0; i < str.length(); i++){
            Character symbol = this.str.charAt(i);
            if (in_alphabet(symbol))
                if (!count_symbol.containsKey(symbol))
                    count_symbol.put(symbol, 1);

                else count_symbol.put(symbol, count_symbol.get(symbol) + 1);
        };

    }

}