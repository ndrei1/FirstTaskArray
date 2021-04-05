package com.golovin.array.service;

import com.golovin.array.entity.CustomArray;
import com.golovin.array.exeption.CustomArrayException;
import com.golovin.array.service.impl.ArrayEditServiceImpl;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class ArrayEditServiceImplTest {
    private final ArrayEditServiceImpl arrayEditService = new ArrayEditServiceImpl();
    private final CustomArray expectedArray = new CustomArray(new int[]{1, 2, 2, 4, 5, 6});
    private final CustomArray arrayToAction = new CustomArray(new int[]{2, 1, 5, 6, 4, 2});

    @Test
    public void shouldChangeNegativeNumbersToPositive() throws IOException, CustomArrayException, CustomArrayException {
        CustomArray expectedArray = new CustomArray(new int[]{1, 2, 2, 4, 5, 6});
        CustomArray arrayToAction = new CustomArray(new int[]{1, -2, 2, 4, 5, 6});
        CustomArray actualCustomArray = arrayEditService.changeNegativeNumbersToPositive(arrayToAction);
        assertEquals(actualCustomArray, expectedArray);
    }

    @Test
    public void shouldReturnSortedArrayFromBubbleSort() {
        CustomArray actualArray = arrayEditService.sortByBubbleMethod(arrayToAction);
        assertEquals(actualArray, expectedArray);
    }

    @Test
    public void shouldReturnSortedArrayFromInsertSort() {
        CustomArray actualArray = arrayEditService.sortByInserts(arrayToAction);
        assertEquals(actualArray, expectedArray);
    }

    @Test
    public void shouldReturnSortedArrayFromSelectionSort() {
        CustomArray actualArray = arrayEditService.sortBySelection(arrayToAction);
        assertEquals(actualArray, expectedArray);
    }
}