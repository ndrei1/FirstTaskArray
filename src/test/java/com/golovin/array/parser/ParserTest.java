package com.golovin.array.parser;

import com.golovin.array.exeption.CustomArrayException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldReturnCorrectArray() throws CustomArrayException {
        String stringToPars = "1 2 3 4 5 6 7";
        Parser parser = new Parser();
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] actualArray = parser.pars(stringToPars);
        assertEquals(actualArray, expectedArray);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void shouldThrowCustomArrayExceptionWithInvalidValue() throws CustomArrayException {
        String stringToPars = "r r r";
        Parser parser = new Parser();
        parser.pars(stringToPars);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void shouldThrowCustomArrayExceptionWithNullValue() throws CustomArrayException {
        Parser parser = new Parser();
        parser.pars(null);
    }

}