package com.golovin.array.service;

import com.golovin.array.entity.CustomArray;

public interface ArrayEditService {

    CustomArray changeNegativeNumbersToPositive(CustomArray customArray);

    CustomArray sortByBubbleMethod(CustomArray customArray);

    CustomArray sortByInserts(CustomArray customArray);

    CustomArray sortBySelection(CustomArray customArray);
}
