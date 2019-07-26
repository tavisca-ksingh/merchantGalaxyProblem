package com.tavisca.workshop.mgttg;

import org.graalvm.compiler.word.Word;

import java.util.HashMap;

public class MapWordToRomanValue {

    protected HashMap<String, String> wordToRoman = new HashMap<String, String>();
    protected HashMap<String, Double> wordsCredits = new HashMap<String,Double>();
    RomanToDecimal romanToDecimal=new RomanToDecimal();

    public double CalculateMissingValue(String[] strArray) {
        int len =strArray.length;
        int val = Integer.parseInt(strArray[len-1]);
        String key = strArray[len-2];
        double result;
        String romanValue="";
        for(int i=0;i<len-1;i++)
        {
            if(wordToRoman.containsKey(strArray[i]))
            {
                romanValue += wordToRoman.get(strArray[i]);
         }
        }

        int divisor= romanToDecimal.romanIntoDigits(romanValue);
        result= (double)val / divisor;
        wordsCredits.put(key,result);
        return result;

    }
}
