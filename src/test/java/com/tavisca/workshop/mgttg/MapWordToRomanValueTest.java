package com.tavisca.workshop.mgttg;

import org.junit.Test;

import static org.junit.Assert.*;

public class MapWordToRomanValueTest {

    MapWordToRomanValue mapWordToRomanValue=new MapWordToRomanValue();

        WordToRomanParser wordToRomanParser= new WordToRomanParser();
        @Test
        public void canParseWordToRomanNumeralStatement(){

            mapWordToRomanValue.wordToRoman.put("glob","I");
            mapWordToRomanValue.wordToRoman.put("prok","V");
            mapWordToRomanValue.wordToRoman.put("pish","X");
            mapWordToRomanValue.wordToRoman.put("tegj","L");
            assertEquals(17,mapWordToRomanValue.CalculateMissingValue("glob glob Silver 34".split(" ")),1 );

        }
        @Test
        public  void wordsToDecimal()
        {
            mapWordToRomanValue.wordToRoman.put("glob","I");
            mapWordToRomanValue.wordToRoman.put("prok","V");
            mapWordToRomanValue.wordToRoman.put("pish","X");
            mapWordToRomanValue.wordToRoman.put("tegj","L");
            assertEquals(42,mapWordToRomanValue.getDecimalFromWords( new String  [] {"pish","tegj","glob","glob"} ));
            assertEquals(4,mapWordToRomanValue.getDecimalFromWords( new String  [] {"glob","prok"} ));
        }

    @Test
    public  void wordsToRoman()
    {
        mapWordToRomanValue.wordToRoman.put("glob","I");
        mapWordToRomanValue.wordToRoman.put("prok","V");
        mapWordToRomanValue.wordToRoman.put("pish","X");
        mapWordToRomanValue.wordToRoman.put("tegj","L");
      //  assertEquals(42,mapWordToRomanValue.getDecimalFromWords( new String  [] {"pish","tegj","glob","glob"} ));
        assertEquals("IV",mapWordToRomanValue.getRomanFromWords( new String  [] {"glob","prok"} ));
    }

    }
