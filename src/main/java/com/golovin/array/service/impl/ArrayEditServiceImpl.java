package com.golovin.array.service.impl;

import com.golovin.array.entity.CustomArray;
import com.golovin.array.service.ArrayEditService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayEditServiceImpl implements ArrayEditService {
    private final static Logger logger = LogManager.getLogger(ArrayEditServiceImpl.class);

    @Override
    public CustomArray changeNegativeNumbersToPositive(CustomArray customArray) {
        int[] changedArray = customArray.getArray();
        for (int i = 0; i < changedArray.length; i++) {
            if (changedArray[i] < 0) {
                changedArray[i] = changedArray[i] * -1;
            }
        }
        logger.info("Array update: all negative numbers change to positive" + Arrays.toString(changedArray));
        return new CustomArray(changedArray);
    }

    @Override
    public CustomArray sortByBubbleMethod(CustomArray customArray) {
        int[] array = customArray.getArray();
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        logger.info("Array update: sorted from bubble method" + Arrays.toString(array));
        return new CustomArray(array);
    }

    @Override
    public CustomArray sortByInserts(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        logger.info("Array update: sorted from insert method" + Arrays.toString(array));
        return new CustomArray(array);
    }

    @Override
    public CustomArray sortBySelection(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        logger.info("Array update: sorted from selection method" + Arrays.toString(array));
        return new CustomArray(array);
    }

}
