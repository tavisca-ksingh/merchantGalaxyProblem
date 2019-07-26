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

    }
