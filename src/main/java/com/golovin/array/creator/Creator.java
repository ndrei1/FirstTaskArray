package com.golovin.array.creator;

import com.golovin.array.entity.CustomArray;

public class Creator {

    public CustomArray createArray(int[] array) {
        return new CustomArray(array);
    }
}
