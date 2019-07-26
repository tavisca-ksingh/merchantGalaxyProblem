package com.tavisca.workshop.mgttg;


import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToDecimalTest {
    @Test
    public void CheckInitialInputSingleDigit()
    {
        RomanToDecimal m= new RomanToDecimal();
        assertEquals(50,m.romanIntoDigits("L"));
    }

    @Test
    public void CheckInitialMultipleInputString()
    {
        RomanToDecimal m= new RomanToDecimal();
        assertEquals(1944,m.romanIntoDigits("MCMXLIV"));
        assertEquals(49,m.romanIntoDigits("XLIX"));
    }


}
