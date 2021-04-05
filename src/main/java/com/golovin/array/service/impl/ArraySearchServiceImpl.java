package com.golovin.array.service.impl;

import com.golovin.array.entity.CustomArray;
import com.golovin.array.exeption.CustomArrayException;
import com.golovin.array.service.ArraySearchService;

import java.util.Arrays;

public class ArraySearchServiceImpl implements ArraySearchService {
    @Override
    public int searchMinValueInArray(CustomArray customArray) throws CustomArrayException {
        return Arrays.stream(customArray.getArray())
                .min()
                .orElseThrow(CustomArrayException::new);
    }

    @Override
    public int searchMaxValueInArray(CustomArray customArray) throws CustomArrayException {
        return Arrays.stream(customArray.getArray())
                .max()
                .orElseThrow(CustomArrayException::new);
    }


    @Override
    public int searchSumOfValueInArray(CustomArray customArray) {
        return Arrays.stream(customArray.getArray())
                .sum();
    }

    @Override
    public double searchAverageValueInArray(CustomArray customArray) throws CustomArrayException {
        return Arrays.stream(customArray.getArray()).
                average().
                orElseThrow(CustomArrayException::new);
    }

    @Override
    public int searchQuantityOfPositiveNumber(CustomArray customArray) {
        return (int) Arrays.stream(customArray.getArray())
                .filter(s -> s > 0)
                .count();
    }

    @Override
    public int searchQuantityOfNegativeNumber(CustomArray customArray) {
        return (int) Arrays.stream(customArray.getArray())
                .filter(s -> s < 0)
                .count();
    }
}
