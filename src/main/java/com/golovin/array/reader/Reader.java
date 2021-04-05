package com.golovin.array.reader;

import com.golovin.array.exeption.CustomArrayException;
import com.golovin.array.validator.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Reader {

    private final static Logger logger = LogManager.getLogger(Reader.class);

    public String readFromFile(String filePath) throws IOException, CustomArrayException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String correctArray = bufferedReader.lines().
                    filter(Validator::validateString).
                    findFirst().orElseThrow(() -> {
                logger.error("Correct array in file is not exist: " + filePath);
                return new CustomArrayException("Correct array is not exist");
            });
            return correctArray;
        } catch (FileNotFoundException e) {
            logger.error("Incorrect path to file: " + filePath);
            throw new CustomArrayException("Incorrect path to file");
        }
    }
}