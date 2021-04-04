package com.golovin.array.service;

import com.golovin.array.entity.CustomArray;
import com.golovin.array.exeption.CustomArrayException;

public interface ArraySearchService {

    public int searchMinValueInArray(CustomArray customArray) throws CustomArrayException;

    public int searchMaxValueInArray(CustomArray customArray) throws CustomArrayException;

    public int searchSumOfValueInArray(CustomArray customArray);

    public double searchAverageValueInArray(CustomArray customArray) throws CustomArrayException;

    public int searchQuantityOfPositiveNumber(CustomArray customArray);

    public int searchQuantityOfNegativeNumber(CustomArray customArray);

}
