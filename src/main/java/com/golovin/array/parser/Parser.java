package com.golovin.array.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class Parser {
    private final static Logger logger = LogManager.getLogger(Parser.class);

    public int[] pars(String array) {
        int[] correctArray = Arrays.stream(array.split(" ")).mapToInt(Integer::parseInt).toArray();
        logger.info("the string was parsing " + array);
        return correctArray;
    }
}
