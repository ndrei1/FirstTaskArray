package com.golovin.array.service;

import com.golovin.array.entity.CustomArray;
import com.golovin.array.exeption.CustomArrayException;
import com.golovin.array.service.impl.ArraySearchServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraySearchServiceImplTest {

    private final ArraySearchServiceImpl searchServiceImplTest = new ArraySearchServiceImpl();
    CustomArray actualCustomArray = new CustomArray(new int[]{1, 2, 3, 4, 5});


    @Test
    public void shouldSearchMinValueInArray() throws CustomArrayException {
        int actualValue = searchServiceImplTest.searchMinValueInArray(actualCustomArray);
        int expectedValue = 1;
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void shouldSearchMaxValueInArray() throws CustomArrayException {
        int actualValue = searchServiceImplTest.searchMaxValueInArray(actualCustomArray);
        int expectedValue = 5;
        assertEquals(actualValue, expectedValue);

    }

    @Test
    public void shouldSearchSumOfValueInArray() {
        int actualValue = searchServiceImplTest.searchSumOfValueInArray(actualCustomArray);
        int expectedValue = 15;
        assertEquals(actualValue, expectedValue);

    }

    @Test
    public void shouldSearchAvgValueInArray() throws CustomArrayException {
        double actualValue = searchServiceImplTest.searchAverageValueInArray(actualCustomArray);
        double expectedValue = 3;
        assertEquals(actualValue, expectedValue);

    }

    @Test
    public void shouldSearchQuantityOfPositiveNumber() {
        int actualValue = searchServiceImplTest.searchQuantityOfPositiveNumber(actualCustomArray);
        int expectedValue = 5;
        assertEquals(actualValue, expectedValue);

    }

    @Test
    public void shouldSearchQuantityOfNegativeNumber() {
        int actualValue = searchServiceImplTest.searchQuantityOfNegativeNumber(actualCustomArray);
        int expectedValue = 0;
        assertEquals(actualValue, expectedValue);

    }
}