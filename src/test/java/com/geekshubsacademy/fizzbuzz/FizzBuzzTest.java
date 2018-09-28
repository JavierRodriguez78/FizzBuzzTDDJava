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
    public static Object[][] dataNumberProvider(){
        return new Object [][]{
                { 3, true},
                { 6, true},
                { 9, true},
                { 12, true},
                {15, true},
                {18, true}
        };
    }

    @Test
    public void firstTest()
    {
        assertTrue(true);
    }

    @Test
    @UseDataProvider("dataNumberProvider")
    public void itShouldReturnFizzIfDivisibleByThree(final int input, final boolean expected)
    {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 3;

        //Act
        boolean result = fizzBuzz.isFizz(input);

        //Assertion
        assertEquals(expected,result);

    }

    @Test
    public void itShouldReturnFizzIfDivisibleByFive()
    {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 5;

        //Act
         boolean result = fizzBuzz.isBuzz(value);

        //Assertion
        assertTrue(result);

    }

}
