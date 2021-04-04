package com.golovin.array.reader;

import com.golovin.array.exeption.CustomArrayException;
import com.golovin.array.exeption.CustomFileException;
import com.golovin.array.validator.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;


public class Reader {

    private final static Logger logger = LogManager.getLogger(Reader.class);

    public int[] read(String pathToFile) throws IOException, CustomFileException, CustomArrayException {
        Validator validator = new Validator();
        FileReader fileReader;
        try {
            fileReader = new FileReader(
                    Objects.requireNonNull(Reader.class.getClassLoader().getResource(pathToFile)).getFile()
            );

        } catch (NullPointerException e) {
            logger.error(pathToFile + "path is wrong, file not found ");
            throw new CustomFileException("path is wrong");
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int[] currentArray = new int[0];
        while ((line = bufferedReader.readLine()) != null) {
            logger.info(line + " line is read");
            currentArray = validator.validate(line);
            if (currentArray.length > 0) {
                break;
            }
        }
        if (currentArray.length == 0) {
            logger.error(" no valid arrays exist in the file");
            throw new CustomArrayException(" no valid arrays exist in the file");
        }
        return currentArray;
    }
}