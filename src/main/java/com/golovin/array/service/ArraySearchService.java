package com.golovin.array.service;

import com.golovin.array.entity.CustomArray;
import com.golovin.array.exeption.CustomArrayException;

public interface ArraySearchService {

    int searchMinValueInArray(CustomArray customArray) throws CustomArrayException;

    int searchMaxValueInArray(CustomArray customArray) throws CustomArrayException;

    int searchSumOfValueInArray(CustomArray customArray);

    double searchAverageValueInArray(CustomArray customArray) throws CustomArrayException;

    int searchQuantityOfPositiveNumber(CustomArray customArray);

    int searchQuantityOfNegativeNumber(CustomArray customArray);
}
