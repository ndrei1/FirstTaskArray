package com.golovin.array.parser;

import com.golovin.array.exeption.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class Parser {
    private final static Logger logger = LogManager.getLogger(Parser.class);

    public int[] pars(String array) throws CustomArrayException {
        if (array == null) {

            throw new CustomArrayException("Invalid value ");
        }
        try {
            int[] correctArray = Arrays
                    .stream(array
                            .split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            logger.info("the string parsed " + array);
            return correctArray;
        } catch (NumberFormatException e) {
            logger.error("Invalid value in array: " + array);
            throw new CustomArrayException("Invalid value in array");
        }
    }
}
