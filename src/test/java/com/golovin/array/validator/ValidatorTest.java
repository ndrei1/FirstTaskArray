package com.golovin.array.validator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidatorTest {
    @Test
    public void shouldReturnTrueWithCorrectData() {
        boolean actual = Validator.validateString("1 2 3 45 -34");
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseWithIncorrectData() {
        boolean actual = Validator.validateString("12 34 k");
        Assert.assertFalse(actual);
    }

    @Test
    public void shouldReturnFalseWithNullData() {
        boolean actual = Validator.validateString(null);
        Assert.assertFalse(actual);
    }

}