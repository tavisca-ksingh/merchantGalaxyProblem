package com.tavisca.workshop.mgttg;

import org.junit.Test;
import static org.junit.Assert.*;

public class InputParserTest {
    WordToRomanParser wordToRomanParser= new WordToRomanParser();
    @Test
   public void canParseWordToRomanNumeralStatement(){

        assertArrayEquals(new String[]{"glob","I"},
                wordToRomanParser.parse("glob is I"));

        assertArrayEquals(new String[]{"prok","V"},
                wordToRomanParser.parse("prok is V"));
    }

    @Test
    public void canParseMultipleWordsToRomanNumeralStatement(){

        assertArrayEquals(new String[]{"glob","prok","Gold","57800"},
                wordToRomanParser.parse("glob prok Gold is 57800 Credits"));
        assertArrayEquals(new String[]{"glob","glob","Silver","34"},
                wordToRomanParser.parse("glob glob Silver is 34 Credits"));
    }

    @Test
    public void canParsetheValueWeNeeded(){

        assertArrayEquals(new String[]{"glob","prok","Silver"},
                wordToRomanParser.parse("how many Credits is glob prok Silver ?"));
        assertArrayEquals(new String[]{"glob","prok","Iron"},
                wordToRomanParser.parse("how many Credits is glob prok Iron ?"));
        assertArrayEquals(new String[]{"I have no idea what you are talking about"},
                wordToRomanParser.parse("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?"));
    }

    @Test
    public void CheckTheValueInMap()
    {

        wordToRomanParser.getTheValueFromParseWords("glob is I");
        wordToRomanParser.getTheValueFromParseWords("prok is V");
        wordToRomanParser.getTheValueFromParseWords("pish is X");
        wordToRomanParser.getTheValueFromParseWords("tegj is L");

       assertEquals("V",  wordToRomanParser.getValueFromWordToRomanMap("prok"));
       assertEquals("X",  wordToRomanParser.getValueFromWordToRomanMap("pish"));
       assertEquals("L",  wordToRomanParser.getValueFromWordToRomanMap("tegj"));
    }

    @Test
    public void CalculateTheMissingValue(){
        wordToRomanParser.getTheValueFromParseWords("glob is I");
        wordToRomanParser.getTheValueFromParseWords("prok is V");
        wordToRomanParser.getTheValueFromParseWords("pish is X");
        wordToRomanParser.getTheValueFromParseWords("tegj is L");
        assertEquals(17,wordToRomanParser.getTheValueFromParseWords("glob glob Silver is 34 Credits"),1);

       assertEquals(14450,wordToRomanParser.getTheValueFromParseWords("glob prok Gold is 57800 Credits"),1);
       assertEquals(195.5,wordToRomanParser.getTheValueFromParseWords("pish pish Iron is 3910 Credits"),1);

        //checking weather missing value is added in he map or not
        assertEquals("17.0",  wordToRomanParser.getValueFromWordToRomanMap("Silver"));
        assertEquals("14450.0",  wordToRomanParser.getValueFromWordToRomanMap("Gold"));
        assertEquals("195.5",  wordToRomanParser.getValueFromWordToRomanMap("Iron"));
    }

    @Test
    public void addAValue()
    {
        assertEquals(2,wordToRomanParser.add(2));
        assertEquals(4,wordToRomanParser.add(2));
        assertEquals(6,wordToRomanParser.add(2));

    }



}
