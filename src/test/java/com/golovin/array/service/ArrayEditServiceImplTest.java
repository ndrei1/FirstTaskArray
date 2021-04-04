package com.golovin.array.service;

import com.golovin.array.creator.Creator;
import com.golovin.array.entity.CustomArray;
import com.golovin.array.exeption.CustomArrayException;
import com.golovin.array.exeption.CustomFileException;
import com.golovin.array.reader.Reader;
import com.golovin.array.service.impl.ArrayEditServiceImpl;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class ArrayEditServiceImplTest {
    private final ArrayEditServiceImpl arrayEditService = new ArrayEditServiceImpl();
    private final CustomArray expectedArray = new CustomArray(new int[]{1, 2, 2, 4, 5, 6});
    private final CustomArray arrayToSorting = new CustomArray(new int[]{2, 1, 5, 6, 4, 2});

    @Test
    public void shouldChangeNegativeNumbersToPositive() throws IOException, CustomArrayException, CustomFileException {
        Reader reader = new Reader();
        Creator creator = new Creator();
        String pathToFile = "data/arrays.txt";
        int[] expectedArray = new int[]{1, 2, 2, 4, 5, 1};
        CustomArray actualCustomArray = creator.createArray(reader.read(pathToFile));
        actualCustomArray = arrayEditService.changeNegativeNumbersToPositive(actualCustomArray);
        assertEquals(actualCustomArray.getArray(), expectedArray);
    }

    @Test
    public void shouldReturnSortedArrayFromBubbleSort() {
        CustomArray actualArray = arrayEditService.sortByBubbleMethod(arrayToSorting);
        assertEquals(actualArray, expectedArray);
    }

    @Test
    public void shouldReturnSortedArrayFromInsertSort() {
        CustomArray actualArray = arrayEditService.sortByInserts(arrayToSorting);
        assertEquals(actualArray, expectedArray);
    }

    @Test
    public void shouldReturnSortedArrayFromSelectionSort() {
        CustomArray actualArray = arrayEditService.sortByInserts(arrayToSorting);
        assertEquals(actualArray, expectedArray);
    }
}