package com.golovin.array.service;

import com.golovin.array.entity.CustomArray;

public interface ArrayEditService {
    public CustomArray changeNegativeNumbersToPositive(CustomArray customArray);

    public CustomArray sortByBubbleMethod(CustomArray customArray);

    public CustomArray sortByInserts(CustomArray customArray);

    public CustomArray sortBySelection(CustomArray customArray);

}
