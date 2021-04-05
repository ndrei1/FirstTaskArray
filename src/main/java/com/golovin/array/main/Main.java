package com.golovin.array.main;

import com.golovin.array.creator.Creator;
import com.golovin.array.entity.CustomArray;
import com.golovin.array.exeption.CustomArrayException;
import com.golovin.array.parser.Parser;
import com.golovin.array.reader.Reader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Reader reader = new Reader();
        Parser parser = new Parser();
        Creator creator = new Creator();

        ClassLoader loader = Main.class.getClassLoader();
        URL resource = loader.getResource("data/arrays.txt");
        assert resource != null;
        String filePath = new File(resource.getFile()).getAbsolutePath();
        try {
            String firstCorrectArray = reader.readFromFile(filePath);
            logger.info("File from path: " + resource.getPath() + " read");
            int[] parsedArray = parser.pars(firstCorrectArray);
            logger.info("String: " + Arrays.toString(parsedArray) + " parsed");
            CustomArray customArray = creator.createArray(parsedArray);
            logger.info("CustomArray: " + customArray.toString() + " created");
        } catch (CustomArrayException | IOException e) {
            logger.error("You broke something somewhere");
        }
    }
}
