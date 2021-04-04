package com.golovin.array.reader;


import com.golovin.array.exeption.CustomArrayException;
import com.golovin.array.exeption.CustomFileException;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class ReaderTest {

    private final Reader reader = new Reader();

    @Test
    public void shouldReturnCorrectArray() throws CustomFileException, CustomArrayException, IOException {
        int[] actualArray = reader.read("data/arrays.txt");
        int[] expectedArray = new int[]{1, 2, -2, 4, 5, 1};
        assertEquals(actualArray, expectedArray);
    }

    @Test(expectedExceptions = {CustomArrayException.class})
    public void shouldThrowCustomArrayExceptionIfFileIsEmpty() throws CustomFileException, CustomArrayException, IOException {
        int[] actualArray = reader.read("data/emptyFile.txt");
        int[] expectedArray = new int[]{1, 2, -2, 4, 5, 1};
        assertEquals(actualArray, expectedArray);
    }


    @Test(expectedExceptions = {CustomArrayException.class})
    public void shouldThrowCustomArrayException() throws CustomFileException, CustomArrayException, IOException {
        String patToFile = "data/arraysIncorrect.txt";
        reader.read(patToFile);
    }

    @Test(expectedExceptions = {CustomFileException.class})
    public void shouldThrowCustomFileException() throws CustomFileException, CustomArrayException, IOException {
        String incorrectPath = "incorrect path";
        reader.read(incorrectPath);
    }

}