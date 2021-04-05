package com.golovin.array.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;


public class Validator {

    private static final String ARRAY_PATTERN = "(\\s?-?\\d+\\s?)+";

    private final static Logger logger = LogManager.getLogger(Validator.class);


    public static boolean validateString(String checkedString) {
        if (checkedString == null) {
            logger.error("String is null ");
            return false;
        }
        boolean flag = Pattern.matches(ARRAY_PATTERN, checkedString);
        return flag;
    }
}
