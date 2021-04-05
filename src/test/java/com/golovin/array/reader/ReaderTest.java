package com.golovin.array.reader;


import com.golovin.array.exeption.CustomArrayException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static org.testng.Assert.assertEquals;

public class ReaderTest {

    private Reader reader;
    private String pathToFileWithCorrectData;
    private String pathToFileWithIncorrectData;
    private String pathToEmptyFile;


    @BeforeClass
    public void setUp() {
        ClassLoader loader = ReaderTest.class.getClassLoader();
        URL fileWithCorrectData = loader.getResource("test_data/arrays.txt");
        URL fileWithIncorrectData = loader.getResource("test_data/arrays_incorrect.txt");
        URL emptyFile = loader.getResource("test_data/empty.txt");
        assert fileWithCorrectData != null;
        pathToFileWithCorrectData = new File(fileWithCorrectData.getFile()).getAbsolutePath();
        assert fileWithIncorrectData != null;
        pathToFileWithIncorrectData = new File(fileWithIncorrectData.getFile()).getAbsolutePath();
        assert emptyFile != null;
        pathToEmptyFile = new File(emptyFile.getFile()).getAbsolutePath();
        reader = new Reader();
    }


    @Test
    public void shouldReturnCorrectData() throws CustomArrayException, IOException {
        String actual = reader.readFromFile(pathToFileWithCorrectData);
        String expected = "1 2 -2 4 5 1";
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {CustomArrayException.class})
    public void shouldThrowCustomArrayException() throws CustomArrayException, IOException {
        reader.readFromFile(pathToFileWithIncorrectData);
    }

    @Test(expectedExceptions = {CustomArrayException.class})
    public void shouldThrowCustomArrayExceptionWithEmptyFile() throws CustomArrayException, IOException {
        reader.readFromFile(pathToEmptyFile);
    }

    @Test(expectedExceptions = {CustomArrayException.class})
    public void shouldThrowCustomArrayExceptionWithNotExistingFile() throws CustomArrayException, IOException {
        reader.readFromFile("incorrect path");
    }

}