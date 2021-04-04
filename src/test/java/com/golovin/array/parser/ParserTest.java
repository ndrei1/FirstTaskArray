package com.golovin.array.parser;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldReturnCorrectArray() {
        String stringToPars = "1 2 3 4 5 6 7";
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        Parser parser = new Parser();
        int[] actualArray = parser.pars(stringToPars);
        assertEquals(actualArray, expectedArray);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void shouldThrowNumberFormatException() {
        String stringToPars = "r r r";
        Parser parser = new Parser();
        parser.pars(stringToPars);
    }
}