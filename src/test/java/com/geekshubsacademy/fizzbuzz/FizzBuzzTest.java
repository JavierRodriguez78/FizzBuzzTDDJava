package com.geekshubsacademy.fizzbuzz;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

@RunWith(DataProviderRunner.class)
public class FizzBuzzTest {

    @DataProvider
    public static Object[][] dataNumberProviderforFizz(){
        return new Object [][]{
                { 3, true},
                { 6, true},
                { 9, true},
                { 12, true},
                {15, true},
                {18, true}
        };
    }
    @DataProvider
    public static Object[][] dataNumberProviderforBuzz(){
        return new Object [][]{
                { 5, true},
                { 10, true},
                { 15, true},
                { 20, true},
                {25, true},
                {30, true}
        };
    }

    @Test
    public void firstTest()
    {
        assertTrue(true);
    }

    @Test
    @UseDataProvider("dataNumberProviderFizz")
    public void itShouldReturnFizzIfDivisibleByThree(final int input, final boolean expected)
    {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Act
        boolean result = fizzBuzz.isFizz(input);
        //Assertion
        assertEquals(expected,result);

    }

    @Test
    @UseDataProvider("dataNumberProviderBuzz")

    public void itShouldReturnFizzIfDivisibleByFive(final int input, final boolean expected)
    {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 5;

        //Act
         boolean result = fizzBuzz.isBuzz(input);

        //Assertion
        assertEquals(expected, result);

    }

}
