package com.golovin.array.validator;

import com.golovin.array.exeption.CustomArrayException;
import com.golovin.array.parser.Parser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Validator {

    private final static Logger logger = LogManager.getLogger(Validator.class);

    public int[] validate(String currentArray) throws CustomArrayException {
        Parser parser = new Parser();
        int[] correctArray = new int[0];
        try {
            correctArray = parser.pars(currentArray);

        } catch (NumberFormatException e) {
            logger.error("reading string is incorrect");
        }

        return correctArray;
    }
}
