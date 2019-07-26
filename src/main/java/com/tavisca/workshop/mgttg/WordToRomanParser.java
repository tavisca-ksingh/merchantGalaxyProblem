package com.tavisca.workshop.mgttg;

import java.util.Arrays;

public class WordToRomanParser {

    public String [] parse(String str) {
        String [] val = str.split(" ");
        if(val.length==3){
            return Singleparse(val);
        }
        else if(val[0].equalsIgnoreCase("how"))
        {
        return parseTheQuestion(val);
        }
        else
        {
            return Multipleparse(val);
        }
    }

    private String[] parseTheQuestion(String[] val) {
        if(Arrays.asList(val).contains("Credits")) {
            int n = Arrays.asList(val).indexOf("is");
            String[] newVal = new String[val.length - (n + 2)];
            int k = 0;
            for (int i = n + 1; i < val.length; i++) {
                if (val[i].equals("?")) continue;
                newVal[k++] = val[i];
            }
            return newVal;
        }
        else{
            return new String[] {"I have no idea what you are talking about"};
        }
    }

    private String [] Singleparse(String [] val) {
        return  new String [] {val[0] , val[2]};
    }

    private String[]  Multipleparse(String [] val) {
        int n=Arrays.asList(val).indexOf("is");
        String[] newVal =new String[n+1];
        int i=0;
        for(String str:val)
        {
            if(str.equals("is")){
                break;
            }

            newVal[i++] = str;
        }
        if(val[val.length-1].equalsIgnoreCase("credits"))
        newVal[i] = val[val.length-2];
        else
            throw new RuntimeException(val[val.length-2] + "credits is missing");
        return newVal;
    }
     MapWordToRomanValue mapWordToRomanValue=new MapWordToRomanValue();


        public double getTheValueFromParseWords(String s)
        {


            String [] strArray = parse(s);
            double results = (double)0;
            if(strArray.length==2)
            {
                mapWordToRomanValue.wordToRoman.put(strArray[0],strArray[1]);
            }
            else if(strArray.length>2){

               results=  mapWordToRomanValue.CalculateMissingValue(strArray);
        }
            return  results;
        }

        int n=0;

        public int add(int n)
        {  this.n+=n;
            return n;
        }

    public String getValueFromWordToRomanMap(String key) {
            if(mapWordToRomanValue.wordToRoman.containsKey(key))
                return mapWordToRomanValue.wordToRoman.get(key);
            else if(mapWordToRomanValue.wordsCredits.containsKey(key)) {
                double value= mapWordToRomanValue.wordsCredits.get(key);
                return Double.toString(value);
            }
            else{
        throw new RuntimeException("Invalid Value");
            }
    }
}
